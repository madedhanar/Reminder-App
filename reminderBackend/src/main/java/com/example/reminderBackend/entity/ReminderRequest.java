package com.example.reminderBackend.entity;


import java.time.LocalDateTime;

//class to request post reminder with patient and doctor id data
public class ReminderRequest {
    public Long id;
    public String reminderTitle;
    public String reminderDescription;
    public LocalDateTime startDate;
    public LocalDateTime endDate;
    public Integer duration;
    public Integer finishFlag;
    public String priority;
    public Long patientId;
    public Long doctorId;
}
