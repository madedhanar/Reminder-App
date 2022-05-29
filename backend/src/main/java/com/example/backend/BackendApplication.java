package com.example.backend;

import com.example.backend.patient.patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackendApplication.class, args);
	}
	@GetMapping
	public List<patient> hello(){
		return List.of(
				new patient(
						1L,
						"patient1",
						"patient1@gmail.com",
						"patient1"
				)
		);
	}



}
