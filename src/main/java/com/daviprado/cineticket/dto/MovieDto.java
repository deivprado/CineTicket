package com.daviprado.cineticket.dto;

import com.daviprado.cineticket.database.entity.Genre;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private String name;
    private String description;
    private Integer durationMinutes;
    private String rating;
    private String posterUrl;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id", nullable = false)
    private Genre genre;
}