package com.SpringDemoJPA.SpringJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringDemoJPA.SpringJPA.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
	

}
