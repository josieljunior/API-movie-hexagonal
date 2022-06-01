package com.api.movies.application.ports.in;

import com.api.movies.application.domain.Movie;

import java.util.List;

public interface MovieServiceInPort {
    Movie save(Movie movie);
    List<Movie> getAll();
    Movie getById(Long id);
    void deleteMovie(Movie movie);
}
