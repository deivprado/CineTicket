package com.daviprado.cineticket.service;

import com.daviprado.cineticket.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public String teste(String name) {
        return "teste " + name;
    }
}
