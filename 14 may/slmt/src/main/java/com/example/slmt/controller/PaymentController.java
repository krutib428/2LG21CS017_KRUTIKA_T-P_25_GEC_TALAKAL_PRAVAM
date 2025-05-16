package com.example.slmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.slmt.model.Payment;
import com.example.slmt.service.PaymentService;

@Controller
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/paymentlist")
    public String showPayments(Model model) {
        model.addAttribute("payment", new Payment());
        model.addAttribute("paymentList", paymentService.getAllPayments());
        return "paymentlist";
    }

    @PostMapping("/savePayment")
    public String savePayment(@ModelAttribute Payment payment) {
        // In a real case, look up customer name from quotation, here it's hardcoded for now
        payment.setCustomerName("Demo Customer");
        paymentService.savePayment(payment);
        return "redirect:/paymentlist";
    }
}
