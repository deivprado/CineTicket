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
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime startTime;
    @Column(nullable = false)
    private String audioType;
    @Column(nullable = false)
    private String exhibitionType;
    @Column(nullable = false)
    private BigDecimal ticketPrice;
    @OneToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;
    @OneToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
}
