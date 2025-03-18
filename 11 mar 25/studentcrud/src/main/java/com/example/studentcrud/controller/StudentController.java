package com.example.studentcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class StudentController {
    @GetMapping
    public String list(){
        return "student/index";
    }
}