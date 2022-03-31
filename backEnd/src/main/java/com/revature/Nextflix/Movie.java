package com.revature.Nextflix;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int movie_id;
    @Column(unique = true, nullable = false)
    private String movie_title;

    public Movie() {
    }

    public Movie(int movie_id, String movie_title){
        this.movie_id = movie_id;
        this.movie_title = movie_title;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id() {
        this.movie_id = movie_id;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title() {
        this.movie_title = movie_title;
    }
}
