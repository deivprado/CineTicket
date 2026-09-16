package com.daviprado.cineticket.dto;

import com.daviprado.cineticket.database.entity.Genre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private Integer durationMinutes;
    @NotNull
    private String rating;
    @NotNull
    private String posterUrl;
    @NotNull
    private Long genreId;
}