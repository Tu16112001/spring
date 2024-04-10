package com.example.demo.repository;

import com.example.demo.entity.Student_score_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudent_scoreRepo extends JpaRepository<Student_score_t, Integer> {
}