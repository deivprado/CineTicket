package com.daviprado.cineticket.controller;

import com.daviprado.cineticket.database.entity.Ticket;
import com.daviprado.cineticket.dto.TicketDto;
import com.daviprado.cineticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Ticket> findAllTicket() {
        return ticketService.findAllTicket();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Ticket> findTicketById(@PathVariable("id") Long id) {
        return ticketService.findTicketById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTicket(TicketDto ticketDto) {
        ticketService.createTicket(ticketDto);
    }

}
