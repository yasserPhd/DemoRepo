package com.example.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Student;
import com.example.app.repository.StudentRepository;
@RestController
@SpringBootApplication
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}

	/*
	 * @GetMapping("/test") public Map<String, Object> hello() { Map<String, Object>
	 * data= new HashMap<>(); data.put("name", "From Docker"); data.put("yasser",
	 * 200); return data; }
	 */
	@Bean
	CommandLineRunner start(StudentRepository studentRepository) {
		return args -> {
			
			studentRepository.save(new Student(1L, "Yasser","systou@gmail.com"));
			studentRepository.save(new Student(2L, "Hamid","hamid@gmail.com"));
			/*
			 * productService.save(new ProductRequestDTO("Ordi HP 878", 87000));
			 * productService.save(new ProductRequestDTO("Ordi Mac bokk", 120000));
			 * productService.save(new ProductRequestDTO("Imprimante Epson", 25000));
			 */
		};
	}
}
