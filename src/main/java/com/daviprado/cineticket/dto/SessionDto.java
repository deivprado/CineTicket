package com.daviprado.cineticket.dto;

import com.daviprado.cineticket.database.entity.Movie;
import com.daviprado.cineticket.database.entity.Room;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SessionDto {

    @NotNull
    private LocalDateTime startTime;
    @NotNull
    private String audioType;
    @NotNull
    private String exhibitionType;
    @NotNull
    private BigDecimal ticketPrice;
    @NotNull
    private Long movieId;
    @NotNull
    private Long roomId;
}
