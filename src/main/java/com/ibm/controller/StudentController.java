package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Student;
import com.ibm.repo.StudentRepo;

@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;
	
@PostMapping("/add")
	public String add(@RequestBody Student std) {
	System.out.println();
		repo.save(std);
		return "Student added";
	}
}
