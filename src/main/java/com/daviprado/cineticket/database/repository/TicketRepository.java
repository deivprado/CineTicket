package com.daviprado.cineticket.database.repository;

import com.daviprado.cineticket.database.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
