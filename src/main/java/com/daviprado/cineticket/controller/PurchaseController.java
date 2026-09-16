package com.daviprado.cineticket.controller;

import com.daviprado.cineticket.database.entity.Purchase;
import com.daviprado.cineticket.dto.PurchaseDto;
import com.daviprado.cineticket.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Purchase> findAllPurchase() {
        return purchaseService.findAllPurchase();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Purchase> findPuchaseById(@PathVariable("id") Long id) {
        return purchaseService.findPurchaseById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPurchase(PurchaseDto purchaseDto) {
        purchaseService.createPurchase(purchaseDto);
    }
}
