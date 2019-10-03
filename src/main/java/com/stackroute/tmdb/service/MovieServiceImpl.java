package com.stackroute.tmdb.service;

import com.stackroute.tmdb.model.Movie;
import com.stackroute.tmdb.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MovieServiceImpl {
    private MovieRepo movieRepo;

    @Autowired
    public MovieServiceImpl(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<Movie> findAll() {
        return movieRepo.findAll();
    }

    public Movie findById(int movieId) throws EntityNotFoundException{
        return movieRepo
                .findById(movieId)
                .orElseThrow(() -> new EntityNotFoundException("not found"));
    }

    public boolean saveMovie(Movie movie) {
        movieRepo.save(movie);
        return true;
    }

    public boolean deleteMovie(int movieId) throws EntityNotFoundException {
        Movie movie =
                movieRepo
                        .findById(movieId)
                        .orElseThrow(() -> new EntityNotFoundException("not found"));
        movieRepo.delete(movie);
        return true;
    }

    public boolean existsById(int id) {
        return movieRepo.existsById(id);
    }

    public List<Movie> getMovieByName(String name) {
        //return movieRepo.movieByName(name);
        return movieRepo.findByTitleIgnoreCaseContaining(name);
    }

}
