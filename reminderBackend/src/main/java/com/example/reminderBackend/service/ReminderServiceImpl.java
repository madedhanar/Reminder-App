package com.example.reminderBackend.service;

import com.example.reminderBackend.entity.Reminder;
import com.example.reminderBackend.repository.DoctorRepository;
import com.example.reminderBackend.repository.PatientRepository;
import com.example.reminderBackend.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

//    @Override
//    public Reminder updateReminder(Long reminderId, Reminder reminder) {
//
//        Reminder reminderDB = reminderRepository.findById(reminderId).stream().filter(reminder -> reminder.getReminderId() == reminderId).findFirst();
//
//
//        if (Objects.nonNull(reminder.getFinishFlag()))
//        {
//
//            reminderDB.setFinishFlag(reminder.getFinishFlag());
//        }
//
//
//        return  reminderRepository.save(reminderDB);
//    }

    @Override
    public List<Reminder> getReminderByPatientId(Long patientId) {
        return reminderRepository.findReminderByPatient(patientId);
    }

    @Override
    public List<Reminder> getReminderByDoctorId(Long doctorId) {
        return reminderRepository.findReminderByDoctor(doctorId);
    }

    @Override
    public Long getCount() {
        return reminderRepository.countReminderByPriority("High");
    }

    @Override
    public Integer updateReminder(Long reminderId, Integer finishFlag) {
        Optional<Reminder> result = reminderRepository.findById(reminderId).stream().filter(reminder -> reminder.getReminderId() == reminderId).findFirst();
        if(result.isPresent()){
            result.get().setFinishFlag(finishFlag);
            return 1;
        } else {
            return 0;
        }
    }


}
