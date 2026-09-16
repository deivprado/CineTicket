package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Genre;
import com.daviprado.cineticket.database.entity.Movie;
import com.daviprado.cineticket.database.repository.GenreRepository;
import com.daviprado.cineticket.database.repository.MovieRepository;
import com.daviprado.cineticket.dto.MovieDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    private final GenreRepository genreRepository;

    public List<Movie> findAllMovie() {
        return movieRepository.findAll();
    }

    public void createMovie(MovieDto movieDto){
        Genre genre =  genreRepository.getReferenceById(movieDto.getGenreId());

        movieRepository.save(Movie.builder()
                    .name(movieDto.getName())
                    .description(movieDto.getDescription())
                    .durationMinutes(movieDto.getDurationMinutes())
                    .rating(movieDto.getRating())
                    .posterUrl(movieDto.getPosterUrl())
                    .genre(genre)
                    .build());
    }

    public void deleteById(Long id) {
        movieRepository.deleteById(id);
    }
}
