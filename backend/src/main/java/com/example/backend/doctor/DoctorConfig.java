package com.example.backend.doctor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DoctorConfig {
    @Bean
    CommandLineRunner commandLineRunner(DoctorRepository repository){
        return args -> {
            Doctor doctor1 = new Doctor(1L, "Doctor1","doctor1@gmail.com","doctor1");
            Doctor doctor2 = new Doctor( "Doctor2","doctor2@gmail.com","doctor2");
            repository.saveAll(
                    List.of(doctor1,doctor2)
            );
        };
    }
}
