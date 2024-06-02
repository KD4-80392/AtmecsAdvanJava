package com.app.crud.service;

import java.util.List;

import com.app.crud.pojo.Student;

public interface StudentService
{

	public List<Student> getStudents();

	public String createStudent(Student student);



	
}
