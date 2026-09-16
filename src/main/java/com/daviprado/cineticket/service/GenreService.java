package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Genre;
import com.daviprado.cineticket.database.repository.GenreRepository;
import com.daviprado.cineticket.dto.GenreDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenreService {

    private final GenreRepository genreRepository;

    public List<Genre> findAllGenre() {
        return genreRepository.findAll();
    }

    public Optional<Genre> findGenreById(Long id) {
        return genreRepository.findById(id);
    }

    public void createGenre(GenreDto genreDto) {
        genreRepository.save(Genre.builder()
                .name(genreDto.getName())
                .build());
    }
}
