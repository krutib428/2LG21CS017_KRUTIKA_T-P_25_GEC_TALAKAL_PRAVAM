package com.example.slmt.controller;

import com.example.slmt.model.Material;
import com.example.slmt.model.MaterialFormWrapper;
import com.example.slmt.service.MaterialService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MaterialController {

    private final MaterialService service;

    public MaterialController(MaterialService service) {
        this.service = service;
    }

    @GetMapping("/materiallist")
    public String showMaterialList(Model model) {
        model.addAttribute("material", new MaterialFormWrapper());
        model.addAttribute("materialList", service.getAllMaterials());
        return "materiallist";
    }

    @PostMapping("/materiallist")
    public String submitMaterials(@ModelAttribute("material") MaterialFormWrapper wrapper, Model model) {
        List<Material> materials = wrapper.getMaterialList();

        // Add quotationNumber and customerName to each material
        for (Material m : materials) {
            m.setQuotationNumber(wrapper.getQuotationNumber());
            m.setCustomerName(wrapper.getCustomerName());
        }

        service.saveAll(materials);

        return "redirect:/materiallist";
    }
}
