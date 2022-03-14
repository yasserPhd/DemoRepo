package com.example.app.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Configuration;

import com.example.app.entity.Student;
@DataJpaTest
public class StudentRepositoryTest {
    
	
	  @Autowired
	  private StudentRepository studentRepository;
	 
	
	

  @Test void itShouldCheckIfExistsName() { Student s=new Student(3L, "Salim","salim@gmail.com");
  
  studentRepository.save(s);
  
  boolean b=studentRepository.SelectExistsEmail(s.getEmail());
  assertThat(b).isTrue();
  
  
  }
 

}
