package com.dev.harsh.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String id) {
        return movieRepository.getMovieByImdbId(id);
    }
}
