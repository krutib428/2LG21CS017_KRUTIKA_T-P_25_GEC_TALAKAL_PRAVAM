package com.example.slmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.slmt.model.Quotation;
import com.example.slmt.service.QuotationService;

@Controller
public class QuotationController {

    private final QuotationService service;

    public QuotationController(QuotationService service) {
        this.service = service;
    }

    @GetMapping("/quotationform")
    public String showForm(Model model) {
        model.addAttribute("quotation", new Quotation()); // Bind empty Quotation for form
        return "quotationform";
    }

    @PostMapping("/quotationform")
    public String submitForm(@ModelAttribute("quotation") Quotation quotation) {
        service.saveQuotation(quotation); // Save to DB
        return "redirect:/quotationlist"; // Redirect to list page
    }

    @GetMapping("/quotationlist")
    public String list(Model model) {
        model.addAttribute("quotations", service.getAllQuotations());
        return "quotationlist";
    }

    @GetMapping("/quotationdetails")
    public String showQuotationDetails(Model model) {
       
        return "quotationdetails";
    }
}
