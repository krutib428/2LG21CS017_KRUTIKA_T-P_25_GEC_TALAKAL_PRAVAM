package com.example.slmt.service;

import com.example.slmt.model.Material;
import com.example.slmt.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository repository;

    public MaterialService(MaterialRepository repository) {
        this.repository = repository;
    }

    public void saveAll(List<Material> materials) {
        repository.saveAll(materials);
    }

    public List<Material> getAllMaterials() {
        return repository.findAll();
    }
}
