package com.example.slmt.service;

import com.example.slmt.model.Quotation;
import com.example.slmt.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotationService {

    @Autowired
    private QuotationRepository quotationRepository;

    public List<Quotation> getAllQuotations() {
        return quotationRepository.findAll(); // Fetch data from database
    }

    public void saveQuotation(Quotation quotation) {
        quotationRepository.save(quotation);
    }

    public Quotation getQuotationById(Long id) {
        return quotationRepository.findById(id).orElse(null);
    }

    public void deleteQuotation(Long id) {
        quotationRepository.deleteById(id);
    }
}
