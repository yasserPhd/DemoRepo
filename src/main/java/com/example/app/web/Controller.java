package com.example.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Student;
import com.example.app.repository.StudentRepository;

@RestController
public class Controller {
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/allStudents")
	
	
	public List<Student> getStudents()
	{
		return studentRepository.findAll();
	}

}
