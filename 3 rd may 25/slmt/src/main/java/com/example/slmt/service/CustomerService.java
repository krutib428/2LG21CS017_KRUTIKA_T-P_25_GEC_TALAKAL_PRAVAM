package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    public List<Customer> getAllCustomers() {
        return Arrays.asList(
            new Customer(1L, "John Doe", "1234567890", "john@email.com", "USA"),
            new Customer(2L, "Jane Smith", "0987654321", "jane@email.com", "Canada")
        );
    }
}
