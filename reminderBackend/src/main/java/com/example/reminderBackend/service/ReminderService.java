package com.example.reminderBackend.service;


import com.example.reminderBackend.entity.Reminder;

import java.util.List;

public interface ReminderService {
    public Reminder saveReminder(Reminder reminder);

    public List<Reminder> getReminder();

    public Reminder getReminderById(Long reminderId);

    public void deleteReminderById(Long reminderId);
    


    public List<Reminder> getReminderByPatientId(Long patientId);

    public List<Reminder> getReminderByDoctorId(Long doctorId);

//    public Long getCount();

    public Reminder updateReminder(Reminder reminder, Long reminderId, Boolean finishFlag);


    Long countReminderByPatientAndPriority(Long patientId, String priority, Boolean finishFlag);
}
