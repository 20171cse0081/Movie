package com.sample.movieticket.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Movie {

	@Id

	int movieId;
	String movieName;
	String movieGenre;
	
	String movieHouse;
	String language;
	String descripting;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieHouse() {
		return movieHouse;
	}
	public void setMovieHouse(String movieHouse) {
		this.movieHouse = movieHouse;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDescripting() {
		return descripting;
	}
	public void setDescripting(String descripting) {
		this.descripting = descripting;
	}
	
	public Movie() {
		
	}
	
	public Movie(int movieId, String movieName, String movieGenre, String movieHouse, String language,
			String descripting) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHouse = movieHouse;
		this.language = language;
		this.descripting = descripting;
	}
	
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieHouse=" + movieHouse + ", language=" + language + ", descripting=" + descripting + "]";
	}
}
