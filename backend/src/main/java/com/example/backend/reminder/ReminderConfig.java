package com.example.backend.reminder;

import com.example.backend.doctor.Doctor;
import com.example.backend.reminder.ReminderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class ReminderConfig {
    @Bean
    CommandLineRunner reminderCommandLineRunner(ReminderRepository repository){
        return args -> {
            Reminder reminder1 = new Reminder("Drink 8 glass of water",
                    "You need to drink 8 glass of water to stay hydrate during the day", 60,
                    LocalDateTime.of(2022,05,31,12,00,00),
                    "High"
                    );
            repository.saveAll(
                    List.of(reminder1)
            );
        };
    }
}
