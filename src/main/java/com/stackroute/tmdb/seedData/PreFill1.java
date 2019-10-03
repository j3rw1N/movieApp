package com.stackroute.tmdb.seedData;

import com.stackroute.tmdb.model.Movie;
import com.stackroute.tmdb.service.MovieService;
import com.stackroute.tmdb.service.MovieServiceImpl;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class PreFill1 implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    MovieServiceImpl movieService;
    @Autowired
    Movie movie;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        movieService.saveMovie(movie);
    }
}
