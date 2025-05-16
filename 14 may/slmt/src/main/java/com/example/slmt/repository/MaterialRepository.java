package com.example.slmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.slmt.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {
}
