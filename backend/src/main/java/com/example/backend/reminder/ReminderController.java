package com.example.backend.reminder;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/reminder")
@CrossOrigin(origins = "http://localhost:8100")
public class ReminderController {
    private final ReminderService reminderService;


    public ReminderController(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @GetMapping
    public List<Reminder> getReminder(){
        return reminderService.getReminder();
    }

    @PostMapping
    public void addNewReminder(@RequestBody Reminder reminder){
        reminderService.addNewReminder(reminder);

    }



}
