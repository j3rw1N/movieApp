package com.stackroute.tmdb.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    private int id;
    private int vote_count;
    private double popularity;
    private double vote_average;
    private String title;
    private String poster_path;

    @Column(columnDefinition="TEXT")
    private String overview;
    private String release_date;
}
