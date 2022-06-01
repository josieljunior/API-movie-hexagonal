package com.api.movies.adapters.in.rest.mapper;

import com.api.movies.adapters.in.rest.dto.MovieDto;
import com.api.movies.application.domain.Movie;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MovieDtoToMovie {

    public Movie mapper (MovieDto movieDto){
        var movie = new Movie();
        BeanUtils.copyProperties(movieDto,movie);
        return movie;
    }
}
