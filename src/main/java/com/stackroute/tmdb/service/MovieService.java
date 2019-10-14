package com.stackroute.tmdb.service;

import com.stackroute.tmdb.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Movie findById(int id);
    Movie saveMovie(Movie movie);
    Movie deleteMovie(int id);
    boolean existsById(int id);
    List<Movie> getMoviesByName(String name);
}
