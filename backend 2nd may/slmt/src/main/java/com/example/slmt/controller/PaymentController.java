package com.example.slmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/paymentlist")
    public String showPaymentForm() {
        return "paymentlist"; // Refers to paymentform.html in templates
    }
    
}

