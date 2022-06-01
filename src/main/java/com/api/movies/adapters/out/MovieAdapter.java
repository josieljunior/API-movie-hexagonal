package com.api.movies.adapters.out;

import com.api.movies.adapters.in.rest.mapper.MovieModelToMovie;
import com.api.movies.adapters.in.rest.mapper.MovieToMovieModel;
import com.api.movies.adapters.out.repository.MovieRepository;
import com.api.movies.application.domain.Movie;
import com.api.movies.application.ports.out.MovieServiceOutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class MovieAdapter implements MovieServiceOutPort {

    @Autowired
    MovieModelToMovie movieModelToMovie;

    @Autowired
    MovieToMovieModel movieToMovieModel;

    @Autowired
    MovieRepository movieRepository;

    @Override
    @Transactional
    public Movie save(Movie movie) {
        var movieModel = movieToMovieModel.mapper(movie);
        return movieModelToMovie.mapper(movieRepository.save(movieModel));
    }

    @Override
    public List<Movie> getAll() {
        return null;
    }

    @Override
    public Movie getById(Long id) {
        return null;
    }
}
