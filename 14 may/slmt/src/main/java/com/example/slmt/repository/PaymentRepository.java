package com.example.slmt.repository;

import com.example.slmt.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Add custom queries if needed, e.g., findByQuotationNumber(...)
}
