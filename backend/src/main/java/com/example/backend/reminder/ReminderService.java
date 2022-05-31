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

    //get reminder method
    public List<Reminder> getReminder(){
        return reminderRepository.findAll();
    }
    //add reminder method
    public void addNewReminder(Reminder reminder) {
        reminderRepository.save(reminder);
    }
}
