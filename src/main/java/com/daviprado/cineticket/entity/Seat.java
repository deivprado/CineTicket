package com.daviprado.cineticket.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private char row;

    @Column(nullable = false)
    private Integer number;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private RoomEntity romm;
}
