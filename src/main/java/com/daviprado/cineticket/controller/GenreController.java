package com.daviprado.cineticket.controller;

import com.daviprado.cineticket.database.entity.Genre;
import com.daviprado.cineticket.dto.GenreDto;
import com.daviprado.cineticket.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
@RequiredArgsConstructor
public class GenreController  {

    private final GenreService genreService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Genre> FindAllGenre() {
        return genreService.findAllGenre();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createGenre(@RequestBody GenreDto genreDto) {
        genreService.createGenre(genreDto);
    }

}
