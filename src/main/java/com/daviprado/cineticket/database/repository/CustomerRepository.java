package com.daviprado.cineticket.database.repository;

import com.daviprado.cineticket.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
