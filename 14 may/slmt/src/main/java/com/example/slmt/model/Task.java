package com.example.slmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String startDate;
    private String endDate;
    private String assignedPerson;
    private String status;
    private String role;

    public Task() {}

    public Task(String name, String startDate, String endDate, String assignedPerson, String status, String role) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.assignedPerson = assignedPerson;
        this.status = status;
        this.role = role;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }
    public String getAssignedPerson() { return assignedPerson; }
    public String getStatus() { return status; }
    public String getRole() { return role; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    public void setAssignedPerson(String assignedPerson) { this.assignedPerson = assignedPerson; }
    public void setStatus(String status) { this.status = status; }
    public void setRole(String role) { this.role = role; }
}