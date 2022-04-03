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
    @Column(unique = true, nullable = false)
    private int movie_time;
    @Column(unique = true, nullable = false)
    private String movie_ratings;
    @Column(unique = true, nullable = false)
    private int movie_year;

    public Movie() {
    }

    public Movie(int movie_id, String movie_title, int movie_time, String movie_ratings, int movie_year) {
        this.movie_id = movie_id;
        this.movie_title = movie_title;
        this.movie_time = movie_time;
        this.movie_ratings = movie_ratings;
        this.movie_year = movie_year;
    }


    public int getmovie_id() {
        return movie_id;
    }

    public void setmovie_id() {
        this.movie_id = movie_id;
    }

    public String getmovie_title() {
        return movie_title;
    }

    public void setmovie_title() {
        this.movie_title = movie_title;
    }

    public int getmovie_time() {
        return movie_time;
    }

    public void setmovie_time() {
        this.movie_time = movie_time;
    }

    public String getmovie_ratings() {
        return movie_ratings;
    }

    public void setmovie_ratings() {
        this.movie_ratings = movie_ratings;
    }

    public String getmovie_year() {
        return movie_year;
    }

    public void setmovie_year() {
        this.movie_year = movie_year;
    }

    @Override
    public String toString() {
        return "movies [movie_title=" + movie_title + ", movie_id=" + movie_id + "movie_time" + movie_time + "movie_ratings" + movie_ratings + "movie_year" + movie_year + "]";
}
