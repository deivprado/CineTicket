package com.daviprado.cineticket.dto;

import com.daviprado.cineticket.database.entity.Purchase;
import com.daviprado.cineticket.database.entity.Seat;
import com.daviprado.cineticket.database.entity.Session;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

    @NotNull
    private BigDecimal price;
    @NotNull
    private Long purchaseId;
    @NotNull
    private Long sessionId;
    @NotNull
    private Long seatId;
}
