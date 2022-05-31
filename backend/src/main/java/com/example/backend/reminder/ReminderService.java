package com.example.backend.reminder;

import com.example.backend.doctor.Doctor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Transactional
    public void updateReminder(Long id,
                             Integer finished) {
        Reminder reminder = reminderRepository.findById(id).orElseThrow(
                () -> new IllegalStateException(
                        "Reminder with id" + id + " does not exist")
        );
            reminder.setFinished(finished);
    }
}
