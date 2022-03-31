package com.revature.Nextflix;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController {
    private MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    public Iterable<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @PostMapping("/movies")
    public Movie postMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable("id") int id) {
        return movieRepository.findByID(id);
    }
}
