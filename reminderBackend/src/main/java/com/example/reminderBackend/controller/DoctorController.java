package com.example.reminderBackend.controller;

import com.example.reminderBackend.entity.Doctor;
import com.example.reminderBackend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")
@CrossOrigin
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    //get all doctor list
    @GetMapping
    public List<Doctor> getDoctor(){

        return doctorService.getDoctor();
    }

    //Login
    @PostMapping("/login")
    public ResponseEntity<Doctor> login(@RequestBody Doctor doctor){

        return doctorService.login(doctor);
    }
}
