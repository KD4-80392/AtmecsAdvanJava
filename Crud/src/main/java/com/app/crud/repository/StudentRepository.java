package com.app.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.crud.pojo.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
