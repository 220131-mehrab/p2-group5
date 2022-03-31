package com.revature.Nextflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Movies{
	private int MovieId;
	private String MovieName;
	private int MovieTime;
	private String MovieRatings;
	private int MovieYear;
	public Movies(int MovieId, String MovieName, int MovieTime, String MovieRatings, int MovieYear){
		this.MovieId = MovieId;
		this.MovieName = MovieName;
		this.MovieTime = MovieTime;
		this.MovieRatings = MovieRatings;
		this.MovieYear = MovieYear;
	}
	public Movies{}
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int MovieId) {
		this.MovieId = MovieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String MovieName) {
		this.MovieName = MovieName;
	}
	public String getMovieRatings() {
		return MovieRatings;
	}
	public void setMovieRatings(String MovieRatings) {this.MovieRatings = MovieRatings;}
	public int getMovieTime() {
		return  MovieTime;
	}
	public void setMovieTime(int MovieTime) {
		this.MovieTime = MovieTime;
	}
	public int getMovieYear() {
		return MovieYear;
	}
	public void setMovieYear(int MovieYear) {
		this.MovieYear = MovieYear;
	}
	@Override
	public String toString() {
		return "Planet [MovieName=" + MovieName + ", MovieId=" + MovieId + "MovieRatings" + MovieRatings + "MovieTime" + MovieTime + "MovieYear" + MovieYear + "]";
	}
}

@SpringBootApplication
public class NextflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextflixApplication.class, args);
	}

}

