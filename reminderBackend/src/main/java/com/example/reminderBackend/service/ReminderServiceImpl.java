package com.example.reminderBackend.service;

import com.example.reminderBackend.entity.Reminder;
import com.example.reminderBackend.repository.DoctorRepository;
import com.example.reminderBackend.repository.PatientRepository;
import com.example.reminderBackend.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private ReminderRepository reminderRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public Reminder saveReminder(Reminder reminder) {

        return reminderRepository.save(reminder);
    }

    @Override
    public List<Reminder> getReminder() {
        return reminderRepository.findAll();
    }

    @Override
    public Reminder getReminderById(Long reminderId) {
        return reminderRepository.findById(reminderId).get();
    }

    @Override
    public void deleteReminderById(Long reminderId) {
        reminderRepository.deleteById(reminderId);
    }

    @Override
    public Reminder updateReminder(Long reminderId, Reminder reminder) {
        Reminder reminderDB = reminderRepository.findById(reminderId).get();

        if (Objects.nonNull(reminder.getReminderTitle()) &&
                !"".equalsIgnoreCase(reminder.getReminderTitle()))
        {
            reminderDB.setReminderTitle(reminder.getReminderTitle());
        }

        if (Objects.nonNull(reminder.getReminderDescription()) &&
                !"".equalsIgnoreCase(reminder.getReminderDescription()))
        {
            reminderDB.setReminderDescription(reminder.getReminderDescription());
        }
        if (Objects.nonNull(reminder.getDuration()))
        {
            reminderDB.setDuration(reminder.getDuration());
        }
        if (Objects.nonNull(reminder.getStartDate()))
        {
            reminderDB.setStartDate(reminder.getStartDate());
        }
        if (Objects.nonNull(reminder.getEndDate()))
        {
            reminderDB.setEndDate(reminder.getEndDate());
        }
        if (Objects.nonNull(reminder.getPriority()) &&
                !"".equalsIgnoreCase(reminder.getPriority()))
        {
            reminderDB.setPriority(reminder.getPriority());
        }
        if (Objects.nonNull(reminder.getFinishFlag()))
        {
            reminderDB.setFinishFlag(reminder.getFinishFlag());
        }


        return  reminderRepository.save(reminderDB);
    }

    @Override
    public List<Reminder> getReminderByPatientId(Long patientId) {
        return reminderRepository.findReminderByPatient(patientId);
    }

    @Override
    public List<Reminder> getReminderByDoctorId(Long doctorId) {
        return reminderRepository.findReminderByDoctor(doctorId);
    }


}
