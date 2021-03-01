package com.sample.movieticket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.movieticket.entity.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie,Integer> {

}
