package com.api.movies.adapters.in.rest;

import com.api.movies.adapters.in.rest.dto.MovieDto;
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
    MovieServiceInPort movieServiceInPort;

    @PostMapping
    public ResponseEntity<Object> registerMovie(@RequestBody @Valid MovieDto movieDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(movieServiceInPort.save(movie));
    }

}
