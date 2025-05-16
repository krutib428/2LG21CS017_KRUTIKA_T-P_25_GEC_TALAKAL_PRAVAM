package com.example.slmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.slmt.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {}