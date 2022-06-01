package com.api.movies.config;

import com.api.movies.adapters.out.MovieAdapter;
import com.api.movies.application.services.MovieService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MovieService movieService(MovieAdapter movieAdapter){
        return new MovieService(movieAdapter);
    }
}
