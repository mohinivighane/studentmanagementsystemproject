package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.studentrepository;
import com.example.demo
.service.studentservice;

@Service
public class studentserviceimpl implements studentservice{

	private studentrepository studentrepository;
	
	public studentserviceimpl(studentrepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	@Override
	public List<student> getallstudents() {
		return studentrepository.findAll();
	}

	@Override
	public student savestudent(student student) {
		return studentrepository.save(student);
	}

	@Override
	public student getstudentbyid(Long id) {
		return studentrepository.findbyid(id).get();
	}

	@Override
	public student updatestudent(student student) {
		return studentrepository.save(student);
	}

	@Override
	public void deletestudentbyid(Long id) {
		studentrepository.deleteById(id);	
	}

}