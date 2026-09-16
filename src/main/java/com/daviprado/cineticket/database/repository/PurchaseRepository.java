package com.daviprado.cineticket.database.repository;

import com.daviprado.cineticket.database.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
