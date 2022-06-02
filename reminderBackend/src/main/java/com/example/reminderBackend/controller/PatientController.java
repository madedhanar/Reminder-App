package com.example.reminderBackend.controller;

import com.example.reminderBackend.entity.Patient;
import com.example.reminderBackend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping()
    public List<Patient> getPatient(){
        return patientService.getPatient();
    }

    @PostMapping
    public Patient savePatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }
}
