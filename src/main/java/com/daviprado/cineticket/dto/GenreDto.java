package com.daviprado.cineticket.dto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenreDto {

    @Column(nullable = false)
    private String name;
}
