package com.daviprado.cineticket.controller;

import com.daviprado.cineticket.database.entity.Movie;
import com.daviprado.cineticket.dto.MovieDto;
import com.daviprado.cineticket.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> movieGet() {
        return movieService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void moviePost(@RequestBody MovieDto movieDto) {
        movieService.createMovie(movieDto);
    }

    @DeleteMapping
    public String movieDelete() {
        return "Deletado com sucesso!";
    }
}
