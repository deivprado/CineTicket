package com.daviprado.cineticket.controller;

import com.daviprado.cineticket.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public String movieGet() {
        return movieService.teste("davi");
    }

    @PostMapping
    public String moviePost() {
        return "Criado com sucesso!";
    }

    @DeleteMapping
    public String movieDelete() {
        return "Deletado com sucesso!";
    }
}
