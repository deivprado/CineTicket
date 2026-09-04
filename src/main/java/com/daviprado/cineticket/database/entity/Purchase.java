package com.daviprado.cineticket.database.entity;

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
public class Purchase {

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
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "session_id", nullable = false)
    private Session session;
}
