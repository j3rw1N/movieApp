package com.stackroute.tmdb.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movies")
@ConfigurationProperties(prefix = "movie1")
@Component
@Scope("prototype")
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
