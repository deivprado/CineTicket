package com.daviprado.cineticket.dto;

import com.daviprado.cineticket.database.entity.Customer;
import com.daviprado.cineticket.database.entity.Session;
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
public class PurchaseDto {

    @NotNull
    private LocalDateTime pruchaseDate;
    @NotNull
    private BigDecimal totalAmount;
    @NotNull
    private String status;
    @NotNull
    private Long customerId;
    @NotNull
    private Long sessionId;
}
