package com.example.backend.reminder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/reminder")
@CrossOrigin
public class ReminderController {
    private final ReminderService reminderService;
    @Autowired
    private ReminderRepository reminderRepository;


    public ReminderController(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @GetMapping
    public List<Reminder> getReminder(){
        return reminderService.getReminder();
    }

    //get reminder by Id
    @GetMapping("api/v1/reminder/{id}")
    public ResponseEntity<Reminder> getReminderById(@PathVariable Long id){
        Reminder reminder = reminderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reminder id not found"));
        return ResponseEntity.ok(reminder);
    }

    @PostMapping
    public void addNewReminder(@RequestBody Reminder reminder){
        reminderService.addNewReminder(reminder);

    }



}
