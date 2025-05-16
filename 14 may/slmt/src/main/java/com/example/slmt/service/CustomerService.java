package com.example.slmt.service;

// com.example.slmt.service.CustomerService
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.slmt.model.Customer;
import com.example.slmt.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer); // ✅ actual save logic
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}






