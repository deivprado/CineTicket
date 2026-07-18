package com.daviprado.cineticket.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime pruchaseDate;
    @Column(nullable = false)
    private BigDecimal totalAmount;
    @Column(nullable = false)
    private String status;
    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;
    @OneToOne
    @JoinColumn(name = "session_id", nullable = false)
    private SessionEntity session;
}
