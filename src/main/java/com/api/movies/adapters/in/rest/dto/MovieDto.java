package com.api.movies.adapters.in.rest.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class MovieDto {

    @NotBlank
    private String title;
    @NotBlank
    private String genre;
    @NotBlank
    private String releaseYear;

}
