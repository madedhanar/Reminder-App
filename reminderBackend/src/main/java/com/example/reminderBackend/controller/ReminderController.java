package com.example.reminderBackend.controller;

import com.example.reminderBackend.entity.Reminder;
import com.example.reminderBackend.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reminder")
@CrossOrigin
public class ReminderController {

    @Autowired
    private ReminderService reminderService;

    //Get reminder Data
    @GetMapping()
    public List<Reminder> getReminder(){
        return reminderService.getReminder();
    }

    //Get reminder data by Reminder ID
    @GetMapping("/{reminderId}")
    public Reminder getReminderById(@PathVariable("reminderId") Long reminderId){
        return reminderService.getReminderById(reminderId);
    }

    //Get reminder data by Patient Id
    @GetMapping("/patient/{patientId}")
    public List<Reminder> getReminderByPatientId(@PathVariable("patientId") Long patientId){
        return reminderService.getReminderByPatientId(patientId);
    }

    //Get reminder data by doctor Id
    @GetMapping("/doctor/{doctorId}")
    public List<Reminder> getReminderByDoctorId(@PathVariable("doctorId") Long doctorId){
        return reminderService.getReminderByDoctorId(doctorId);
    }
    //Get Count
    @GetMapping("/getcount")
    public Long getCountByPriority()
    {
        return reminderService.getCount();
    }

    //Post Reminder
    @PostMapping()
    public Reminder saveReminder(@RequestBody Reminder reminder){
        return reminderService.saveReminder(reminder);
    }

    //Delete reminder data
    @DeleteMapping("/{reminderId}")
    public String deleteReminderById(@PathVariable("reminderId") Long reminderId){
        reminderService.deleteReminderById(reminderId);
        return "Reminder deleted successfully";
    }

    @PatchMapping("/{reminderId}")
    public Integer updateReminder(@PathVariable("reminderId") Long reminderId,
                                  @RequestParam Integer finishflag){
        return reminderService.updateReminder(reminderId,finishflag);
    }
}
