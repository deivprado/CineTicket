package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Customer;
import com.daviprado.cineticket.database.entity.Purchase;
import com.daviprado.cineticket.database.entity.Session;
import com.daviprado.cineticket.database.repository.CustomerRepository;
import com.daviprado.cineticket.database.repository.PurchaseRepository;
import com.daviprado.cineticket.database.repository.SessionRepository;
import com.daviprado.cineticket.dto.PurchaseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final CustomerRepository customerRepository;
    private final SessionRepository sessionRepository;

    public List<Purchase> findAllPurchase() {
        return purchaseRepository.findAll();
    }

    public Optional<Purchase> findPurchaseById(Long id) {
        return purchaseRepository.findById(id);
    }

    public void createPurchase(PurchaseDto purchaseDto) {
        Customer customer = customerRepository.getReferenceById(purchaseDto.getCustomerId());
        Session session = sessionRepository.getReferenceById(purchaseDto.getSessionId());

        purchaseRepository.save(Purchase.builder()
                .pruchaseDate(purchaseDto.getPruchaseDate())
                .totalAmount(purchaseDto.getTotalAmount())
                .status(purchaseDto.getStatus())
                .customer(customer)
                .session(session)
                .build());
    }

}
