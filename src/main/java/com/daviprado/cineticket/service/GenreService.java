package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Genre;
import com.daviprado.cineticket.database.repository.GenreRepository;
import com.daviprado.cineticket.dto.GenreDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository genreRepository;

    public List<Genre> findAllGenre() {
        return genreRepository.findAll();
    }

    public void createGenre(GenreDto genreDto) {
        genreRepository.save(Genre.builder()
                .name(genreDto.getName())
                .build());
    }
}
