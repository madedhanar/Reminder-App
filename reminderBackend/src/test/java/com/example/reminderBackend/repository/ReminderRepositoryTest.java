package com.example.reminderBackend.repository;

import com.example.reminderBackend.entity.Reminder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

@SpringBootTest
class ReminderRepositoryTest {

    @Autowired
    private ReminderRepository reminderRepository;

    @Test
    public void saveReminder(){

        Reminder reminder = Reminder.builder()
                .reminderTitle("Walking for 60 Minutes")
                .reminderDescription("Walking for 60 Minutes is good cardio practice that will improve your stamina endurace")
                .startDate(LocalDateTime.of(2022, Calendar.MAY, 29, 12,12))
                .endDate(LocalDateTime.of(2022, Calendar.MAY, 29, 12,12))
                .duration(60)
                .priority("High")
                .finishFlag(0)
                .build();

        reminderRepository.save(reminder);
    }

    @Test
    public void printAllReminder(){
        List<Reminder> reminderList = reminderRepository.findAll();
/
        System.out.println("reminderList = " + reminderList);
    }
    @Test
    public void printReminderByTitle(){
        List<Reminder> reminders = reminderRepository.findByReminderTitle("Walking");

        System.out.println("reminders = " + reminders);
    }

    @Test
    public void printReminderByTitleContaining(){
        List<Reminder> reminders = reminderRepository.findByReminderTitleContaining("Wal");

        System.out.println("reminders = " + reminders);
    }
//
//    @Test
//    public void printReminderByPriority(){
//        List<Reminder> reminder = reminderRepository.findReminderByPriority_name("High");
//        System.out.println("reminder = " + reminder);
//    }
//
//    @Test
//    public void printReminderByJPQL(){
//        String title = reminderRepository.findContainingTitle("Walk");
//        System.out.println("title = " + title);
//    }

}