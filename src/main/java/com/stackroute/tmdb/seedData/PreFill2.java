package com.stackroute.tmdb.seedData;

import com.stackroute.tmdb.model.Movie;
import com.stackroute.tmdb.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.stackroute.tmdb"})
public class PreFill2 implements CommandLineRunner {

    @Autowired
    MovieServiceImpl movieService;

    @Value("${movie2.title}")
    private String title;

    @Autowired
    private Environment env;

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie();
        movie.setTitle(title);
        System.out.println(env.getProperty("movie2.id"));
        movie.setId(1234);
        movieService.saveMovie(movie);
    }
}
