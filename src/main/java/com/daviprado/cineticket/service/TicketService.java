package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Purchase;
import com.daviprado.cineticket.database.entity.Seat;
import com.daviprado.cineticket.database.entity.Session;
import com.daviprado.cineticket.database.entity.Ticket;
import com.daviprado.cineticket.database.repository.PurchaseRepository;
import com.daviprado.cineticket.database.repository.SeatRepository;
import com.daviprado.cineticket.database.repository.SessionRepository;
import com.daviprado.cineticket.database.repository.TicketRepository;
import com.daviprado.cineticket.dto.TicketDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final PurchaseRepository purchaseRepository;
    private final SessionRepository sessionRepository;
    private final SeatRepository seatRepository;

    public List<Ticket> findAllTicket() {
        return ticketRepository.findAll();
    }

    public Optional<Ticket> findTicketById(Long id) {
        return ticketRepository.findById(id);
    }

    public void createTicket(TicketDto ticketDto) {
        Purchase purchase = purchaseRepository.getReferenceById(ticketDto.getPurchaseId());
        Session session = sessionRepository.getReferenceById(ticketDto.getSessionId());
        Seat seat = seatRepository.getReferenceById(ticketDto.getSeatId());

        ticketRepository.save(Ticket.builder()
                .price(ticketDto.getPrice())
                .purchase(purchase)
                .session(session)
                .seat(seat)
                .build());
    }

}
