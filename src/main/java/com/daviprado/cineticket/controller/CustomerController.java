package com.daviprado.cineticket.controller;

import com.daviprado.cineticket.database.entity.Customer;
import com.daviprado.cineticket.dto.CustomerDto;
import com.daviprado.cineticket.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> findAllCustomer() {
        return customerService.findAllCustomer();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Customer> findCustomerById(@PathVariable("id") Long id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomer(CustomerDto customerDto) {
        customerService.createCustomer(customerDto);
    }
}
