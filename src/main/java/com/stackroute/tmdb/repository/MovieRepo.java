package com.stackroute.tmdb.repository;

import com.stackroute.tmdb.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
    List<Movie> findByTitleIgnoreCaseContaining(String title);
}
