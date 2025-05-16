package com.example.slmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.slmt.model.Customer;
import com.example.slmt.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customerform")
    public String showCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customerform";
    }
    @PostMapping("/savecustomer")  // <-- This handles the POST
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customerlist";
    }
     
    

    @GetMapping("/customerlist")
    public String customerList(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        System.out.println("Fetched customers: " + customers);
        model.addAttribute("customers", customers);
        return "customerlist";
    }
   
}
    

