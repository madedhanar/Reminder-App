package com.example.backend.reminder;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }



    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getFinished() {
        return 0;
    }

    public void setFinished(Integer finished) {
        this.finished = 0;
    }


    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", start_date=" + start_date +
                ", priority='" + priority + '\'' +
                ", finished=" + finished +
                '}';
    }
}
