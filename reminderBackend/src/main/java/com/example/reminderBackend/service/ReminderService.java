package com.example.reminderBackend.service;


import com.example.reminderBackend.entity.Patient;
import com.example.reminderBackend.entity.Reminder;
import com.example.reminderBackend.entity.ReminderRequest;

import java.util.List;

public interface ReminderService {
    public Reminder saveReminder(Reminder reminder);

    public List<Reminder> getReminder();

    public Reminder getReminderById(Long reminderId);

    public void deleteReminderById(Long reminderId);

    public Reminder updateReminder(Long reminderId, Reminder reminder);

    public Reminder saveReminderById(ReminderRequest reminderRequest);

    public List<Reminder> getReminderByPatientId(Long patientId);

    public List<Reminder> getReminderByDoctorId(Long doctorId);


}
