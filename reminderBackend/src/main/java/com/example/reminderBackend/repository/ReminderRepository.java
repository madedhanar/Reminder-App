package com.example.reminderBackend.repository;

import com.example.reminderBackend.entity.Patient;
import com.example.reminderBackend.entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
    public List<Reminder> findByReminderTitle(String reminderTitle);

    public List<Reminder> findByReminderTitleContaining(String title);

    public List<Reminder> findReminderByPatient(Long patientId);
    public List<Reminder> findReminderByDoctor(Long doctorId);

//    public List<Reminder> findReminderByPriority_name(String priority);





}
