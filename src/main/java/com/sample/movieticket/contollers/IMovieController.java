package com.sample.movieticket.contollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sample.movieticket.entity.Movie;
import com.sample.movieticket.repositories.IMovieRepository;
import com.sample.movieticket.services.IMovieService;

@RestController
public class IMovieController {
	
	@Autowired
	IMovieService ims;
	
	@Autowired
	IMovieRepository iMR;
		
	Optional<Movie> movie=null;
	
	@PostMapping("/addmovies")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addMovie(@RequestBody Movie m)
	{
		ims.addMovie(m);
	}
	
	
	@GetMapping("/movies/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public Movie findMovieById(@PathVariable("id") int id) {
		
		return ims.viewMovie(id);
	}
	
	@GetMapping("/movies")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Movie> viewMovieList(){
		return ims.viewMovieList();
	}
	
	@DeleteMapping("/movies/{id}")
	public void removeMovie(@PathVariable("id") int id) {
		movie=iMR.findById(id);
		Movie m = null;
		if(movie.isPresent()) {
			m=movie.get();
			iMR.delete(m);
		}
	
	}
	

}
