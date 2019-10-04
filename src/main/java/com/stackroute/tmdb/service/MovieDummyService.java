package com.stackroute.tmdb.service;

import com.stackroute.tmdb.exceptions.MovieAlreadyExistException;
import com.stackroute.tmdb.model.Movie;
import com.stackroute.tmdb.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("dummy")
@Profile("dev")
public class MovieDummyService implements MovieService {
    private MovieRepo movieRepo;

    @Autowired
    public MovieDummyService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public Movie findById(int id) {
        return null;
    }

    public boolean saveMovie(Movie movie) {
        return true;
    }

    @Override
    public boolean deleteMovie(int id) {
        return false;
    }

    @Override
    public boolean existsById(int id) {
        return false;
    }

    @Override
    public List<Movie> getMovieByName(String name) {
        return null;
    }
}
