package com.daviprado.cineticket.database.repository;

import com.daviprado.cineticket.database.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
