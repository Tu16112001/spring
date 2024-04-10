package com.example.demo.repository;

import com.example.demo.entity.Student_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student_t, Integer> {

}
