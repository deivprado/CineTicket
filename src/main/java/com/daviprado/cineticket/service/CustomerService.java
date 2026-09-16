package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Customer;
import com.daviprado.cineticket.database.repository.CustomerRepository;
import com.daviprado.cineticket.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public void createCustomer(CustomerDto customerDto) {
        customerRepository.save(Customer.builder()
                .name(customerDto.getName())
                .email(customerDto.getEmail())
                .build());
    }
}
