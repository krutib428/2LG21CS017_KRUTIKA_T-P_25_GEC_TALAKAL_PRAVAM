package com.example.slmt.service;

import java.util.List;

import com.example.slmt.model.Payment;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment savePayment(Payment payment);
    Payment getPaymentById(Long id);
    void deletePayment(Long id);
}




