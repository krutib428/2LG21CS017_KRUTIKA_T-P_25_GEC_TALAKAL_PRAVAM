package com.example.studentcrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentcrud.model.Student;

public interface KrutikaEmployeeRepository extends JpaRepository<Student, Long>  {
}
