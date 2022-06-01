package com.api.movies.application.services;

import com.api.movies.application.ports.in.MovieServiceInPort;
import com.api.movies.application.ports.out.MovieServiceOutPort;
import com.api.movies.application.domain.Movie;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public class MovieService implements MovieServiceInPort {

    private final MovieServiceOutPort movieOutPort;

    public MovieService(MovieServiceOutPort movieOutPort) {
        this.movieOutPort = movieOutPort;
    }

    @Override
    public Movie save(Movie movie) {
        movie.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return movieOutPort.save(movie);
    }

    @Override
    public List<Movie> getAll() {
        return movieOutPort.getAll();
    }

    @Override
    public Movie getById(Long id) {
        return movieOutPort.getById(id);
    }

    @Override
    public void deleteMovie(Movie movie) {

    }
}
