package com.example.slmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.slmt.model.Quotation;

@Repository
public interface QuotationRepository extends JpaRepository<Quotation, Long> {
    // Custom query methods (if needed) can be added here
}
