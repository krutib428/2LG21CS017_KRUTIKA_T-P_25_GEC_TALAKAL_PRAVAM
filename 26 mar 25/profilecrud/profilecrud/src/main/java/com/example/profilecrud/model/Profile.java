package com.example.profilecrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String usn;
    private String email;
    private String phone;
    private String adress;
    private String section;
    private String gender;
    private String DOB;
    private String file;
    private String Ack;
    
    public Long getId( ) {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getUsn(){
        return usn;
    }
    public void setUsn(String usn){
        this.usn = usn;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getSection(){
        return section;
    }
    public void setSection(String section){
        this.section = section;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getDOB(){
        return DOB;
    }
    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    public String getFile(){
        return file;
    }
    public void setFile(String file){
        this.file = file;
    }
    public String getAck(){
        return Ack;
    }
    public void setAck(String Ack){
        this.Ack = Ack;


    }
}