package com.example.backend.reminder;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Data
@Table
public class Reminder {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String title;
    private String description;
    private Integer duration;
    private LocalDateTime start_date;
    private String priority;
    private Integer finished;

    public Reminder() {
    }

    public Reminder(String title, String description, Integer duration, LocalDateTime start_date, String priority) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.start_date = start_date;
        this.priority = priority;
    }
}
