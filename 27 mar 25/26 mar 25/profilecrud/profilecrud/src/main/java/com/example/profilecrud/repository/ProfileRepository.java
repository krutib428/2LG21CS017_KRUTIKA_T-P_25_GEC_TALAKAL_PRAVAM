package com.example.profilecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.profilecrud.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {
    
}
