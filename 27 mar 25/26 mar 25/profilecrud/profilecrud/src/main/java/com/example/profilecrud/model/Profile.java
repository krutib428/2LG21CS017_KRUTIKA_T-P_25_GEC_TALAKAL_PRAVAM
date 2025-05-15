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
        private String gender;
        private String color;
        private String font;
        private String profilepic;
     
        
        public Long getId( ) {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getGender(){
            return gender;
        }
        public void setGender(String gender){
            this.gender = gender;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public String getFont(){
            return font;
        }
        public void setFont(String font){
            this.font = font;
        }
        public String getProfilepic(){
            return profilepic;
        }
        public void setProfilepic(String profilepic){
            this.profilepic = profilepic;
        }
        
     
    
    
        }
    

