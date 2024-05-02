package com.wipro.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.wipro.movie.entity.Movie;
import com.wipro.movie.repo.MovieRepository;

@RestController
@RequestMapping("/api") // Define a base path for all endpoints in this controller
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/movies") // Change the endpoint to match the POST request
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie); // Return the saved movie
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
