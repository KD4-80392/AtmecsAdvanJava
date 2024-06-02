package com.app.crud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.crud.pojo.Student;
import com.app.crud.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/get_all_students")
	public List<Student> getStudents() {
		return studentService.getStudents() ;
	}
	
	@PostMapping("/create_student")
	public String createStudent(@RequestBody Student student) {
		return studentService.createStudent(student) ;
	}
	

}
