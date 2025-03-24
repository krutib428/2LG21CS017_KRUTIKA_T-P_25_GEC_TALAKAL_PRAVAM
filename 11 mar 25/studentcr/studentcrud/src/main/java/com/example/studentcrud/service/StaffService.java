package com.example.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcrud.model.Staff;
import com.example.studentcrud.repository.StaffRepository;

@Service
public class StaffService {

    @Autowired
    private  StaffRepository staffRepository;

    public List<Staff> listAll() {
        return staffRepository.findAll();
    }

    public void saveStaff(Staff staff) {
        staffRepository.save(staff);
    }

    public Staff getStaff(Long id) {
        return staffRepository.findById(id).orElse(null);
    }

    public void deleteStaff(Long id) {
        staffRepository.deleteById(id);
    }

    public void save(Staff sta) {
       
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}