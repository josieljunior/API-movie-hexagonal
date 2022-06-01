package com.api.movies.application.ports.out;

import com.api.movies.application.domain.Movie;

import java.util.List;

public interface MovieServiceOutPort {
    Movie save(Movie movie);

    List<Movie> getAll();

    Movie getById(Long id);
}
