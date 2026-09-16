package com.daviprado.cineticket.dto;

import com.daviprado.cineticket.database.entity.Room;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeatDto {

    @NotNull
    private char row;
    @NotNull
    private Integer number;
    @NotNull
    private Long roomId;
}
