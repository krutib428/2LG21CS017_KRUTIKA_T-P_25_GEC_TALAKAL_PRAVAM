package com.example.studentcrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.studentcrud.model.Student;
import com.example.studentcrud.service.StudentService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/users")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("student",studentService.listAll() );
        return "student/index"; 
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        return "student/create";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student stu) {
        studentService.saveStudent(stu);
        return "redirect:/users/list";
    }
}