package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.student;

public interface studentservice {
	List<student> getallstudents();
	
	student saveStudent(student student);
	
	student getstudentbyid(Long id);
	
	student updatestudent(student student);
	
	void deletestudentbyid(Long id);
}