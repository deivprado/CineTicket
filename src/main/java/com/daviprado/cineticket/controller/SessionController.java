package com.daviprado.cineticket.controller;

import com.daviprado.cineticket.database.entity.Session;
import com.daviprado.cineticket.dto.SessionDto;
import com.daviprado.cineticket.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/session")
@RequiredArgsConstructor
public class SessionController {

    private final SessionService sessionService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Session> findAllSession() {
        return sessionService.findAllSession();
    }

    @GetMapping(value = "/id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Session> findSessionById(@PathVariable("id") Long id) {
        return sessionService.findSessionById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSession(SessionDto sessionDto) {
        sessionService.createSession(sessionDto);
    }

}
