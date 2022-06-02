package com.example.reminderBackend.controller;

import com.example.reminderBackend.entity.Doctor;
import com.example.reminderBackend.repository.DoctorRepository;
import com.example.reminderBackend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;


    @GetMapping
    public List<Doctor> getDoctor(){
        return doctorService.getDoctor();
    }
    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }
}
