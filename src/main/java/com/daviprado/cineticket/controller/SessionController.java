package com.daviprado.cineticket.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @GetMapping
    public String sessionGet() {
        return "Super Men";
    }

    @PostMapping
    public String sessionPost() {
        return "Criado com sucesso!";
    }

    @DeleteMapping
    public String sessionDelete() {
        return "Cancelada com sucesso!";
    }
}
