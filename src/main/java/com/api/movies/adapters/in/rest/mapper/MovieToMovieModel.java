package com.api.movies.adapters.in.rest.mapper;

import com.api.movies.adapters.in.rest.dto.MovieDto;
import com.api.movies.adapters.out.models.MovieModel;
import com.api.movies.application.domain.Movie;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MovieToMovieModel {

    public MovieModel mapper (Movie movie){
        var movieModel = new MovieModel();
        BeanUtils.copyProperties(movie,movieModel);
        return movieModel;
    }
}
