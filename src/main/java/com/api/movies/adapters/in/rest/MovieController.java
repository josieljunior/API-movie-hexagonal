package com.api.movies.adapters.in.rest;

import com.api.movies.adapters.in.rest.dto.MovieDto;
import com.api.movies.adapters.in.rest.mapper.MovieDtoToMovie;
import com.api.movies.adapters.in.rest.mapper.MovieToMovieModel;
import com.api.movies.adapters.out.models.MovieModel;
import com.api.movies.application.ports.in.MovieServiceInPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieDtoToMovie movieDtoToMovie;

    @Autowired
    MovieServiceInPort movieServiceInPort;

    @Autowired
    MovieToMovieModel movieToMovieModel;

    @PostMapping
    public ResponseEntity<MovieModel> registerMovie(@RequestBody @Valid MovieDto movieDto){
        var movie = movieDtoToMovie.mapper(movieDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                movieToMovieModel.mapper(movieServiceInPort.save(movie)));
    }

}
