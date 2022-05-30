package com.example.backend.reminder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReminderService {
    private final ReminderRepository reminderRepository;

    @Autowired
    public ReminderService(ReminderRepository reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    public List<Reminder> getReminder(){
        return reminderRepository.findAll();
    }

    public void addNewReminder(Reminder reminder) {
        reminderRepository.save(reminder);
    }
}