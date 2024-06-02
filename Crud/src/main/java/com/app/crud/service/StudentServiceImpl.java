package com.app.crud.service;

import java.util.List;
import com.app.crud.repository.StudentRepository ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crud.pojo.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public String createStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return "Student data created";
	}

}
