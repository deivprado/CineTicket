package com.daviprado.cineticket.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {

    @NotNull
    private Integer number;
    @NotNull
    private Integer totalSeats;
}
