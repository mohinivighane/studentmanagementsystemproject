package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.student;

public interface studentrepository extends JpaRepository<student, Long>{

}