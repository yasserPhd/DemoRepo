package com.example.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.app.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

	//List<Student> getAll();
	
	  @Query("SELECT CASE WHEN" + " COUNT(s) > 0"
	  + " THEN TRUE ELSE" +
	  " FALSE END" +
	  " FROM Student s " +
	  "WHERE s.email=?1")
	 
	Boolean SelectExistsEmail(String email);
	

}
