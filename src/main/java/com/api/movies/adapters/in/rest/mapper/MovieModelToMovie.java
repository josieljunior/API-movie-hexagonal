package com.api.movies.adapters.in.rest.mapper;

import com.api.movies.adapters.out.models.MovieModel;
import com.api.movies.application.domain.Movie;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MovieModelToMovie {

    public Movie mapper (MovieModel movieModel){
        var movie = new Movie();
        BeanUtils.copyProperties(movieModel,movie);
        return movie;
    }
}
