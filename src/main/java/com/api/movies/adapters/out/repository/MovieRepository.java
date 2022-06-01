package com.api.movies.adapters.out.repository;


import com.api.movies.adapters.out.models.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieModel, Long> {

}
