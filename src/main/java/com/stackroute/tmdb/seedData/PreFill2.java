package com.stackroute.tmdb.seedData;

import com.stackroute.tmdb.model.Movie;
import com.stackroute.tmdb.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PreFill2 implements CommandLineRunner {

    @Autowired
    MovieServiceImpl movieService;

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie();
        movie.setTitle("wwwwwwwwwwwwww");
        movie.setId(1234);
        movie.setOverview("vvvvvvvvv");
        movieService.saveMovie(movie);
    }
}
