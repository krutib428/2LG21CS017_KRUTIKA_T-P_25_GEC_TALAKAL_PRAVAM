package com.example.profilecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.profilecrud.model.Profile;
import com.example.profilecrud.service.ProfileService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/new")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("profile",profileService.listAll() );
        return "profile/index"; 
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("profile", new Profile());
        return "profile/create";
    }

    @PostMapping("/save")
    public String saveProfile(@ModelAttribute Profile pro) {
        profileService.save(pro);
        return "redirect:/new/list";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteProfile(@PathVariable Long id) {
        profileService.deleteProfile(id);
        return "redirect:/new/list";
    }
    @GetMapping("/edit/{id}")
    public String editProfile(@PathVariable Long id,Model model) {
        model .addAttribute("profile",profileService.getProfile(id));
        return "proffile/edit";
    }
   
    @PostMapping("/update/{id}")
    public String saveProfile(@PathVariable Long id, 
        @ModelAttribute Profile pro) {
           pro.setId(id);
           profileService.save(pro);
           return "redirect:/new/list"; 
        }
    }