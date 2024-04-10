package com.example.demo.repository;

import com.example.demo.entity.Subject_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepo extends JpaRepository<Subject_t, Integer> {
}