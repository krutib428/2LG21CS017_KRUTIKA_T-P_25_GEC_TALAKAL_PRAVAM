package com.example.slmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.slmt.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can add custom queries here if needed
}
