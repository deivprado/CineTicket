package com.daviprado.cineticket.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @GetMapping
    public String purchaseGet() {
        return "Super Men";
    }

    @PostMapping
    public String purchasePost() {
        return "Criado com sucesso!";
    }

    @DeleteMapping
    public String purchaseDelete() {
        return "Cancelada com sucesso!";
    }

}
