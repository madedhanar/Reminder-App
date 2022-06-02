package com.example.backend.patient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PatientConfig {
    @Bean
    CommandLineRunner patientCommandLineRunner(PatientRepository repository){
        return args -> {
            List<patient> patients = new ArrayList<>();
            patients.add(new patient("Patient1","patient1@gmail.com","patient1"));
            patients.add(new patient("Patient2","patient2@gmail.com","patient2"));

            repository.saveAll(patients);
        };
    }
}
