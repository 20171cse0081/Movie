package com.sample.movieticket.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.movieticket.entity.Movie;
import com.sample.movieticket.repositories.IMovieRepository;

@Service
public class IMovieService {
	@Autowired
	IMovieRepository iMR;
		
	Optional<Movie> movie=null;
	
	public void addMovie( Movie m) {
		
		movie=iMR.findById(m.getMovieId());
		
		
		if(movie.isEmpty()) {
			iMR.save(m);
		}
		
	}
	
public Movie viewMovie(int id) {
		
		
		Optional<Movie> movie = iMR.findById(id);
		Movie m = null;
		if(movie.isPresent()) {
			m = movie.get();
		}
		
		
		return m;
	}

public List<Movie> viewMovieList(){
	
	List<Movie> movies=iMR.findAll();
	return movies;
}


//public List<Movie> movieList(int id) {
//	
//	
//	
//	
//	
//	return movie;
//}
	


}
