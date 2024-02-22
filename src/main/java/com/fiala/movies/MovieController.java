package com.fiala.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "http://localhost:3000")

public class MovieController {
    @Autowired
    private MovieService moviesService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(moviesService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovieById(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Movie>>(moviesService.singleMovie(id), HttpStatus.OK);
    }

    @GetMapping("/byImdbId/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovieByImdbId(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(moviesService.singleMovie(imdbId), HttpStatus.OK);
    }
}
