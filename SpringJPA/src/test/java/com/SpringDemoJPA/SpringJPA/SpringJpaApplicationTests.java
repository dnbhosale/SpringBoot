package com.SpringDemoJPA.SpringJPA;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.SpringDemoJPA.SpringJPA.entities.Student;
import com.SpringDemoJPA.SpringJPA.repository.StudentRepository;

@SpringBootTest
class SpringJpaApplicationTests {
	
	
	/*@Autowired
	StudentRepository repository;
	
	@Test
	private void testStudentSave() {
		
		Student student=new Student();
		student.setId(1);
		student.setName("DNYAN");
		student.setTestScore(10);
		repository.save(student);
		@SuppressWarnings("deprecation")
		 Student s=repository.findById(1l).get();
		assertNotNull(s);
	}*/

	@Test
	void contextLoads() {
	}

}
