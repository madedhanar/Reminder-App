package com.example.backend.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patient")
@CrossOrigin(origins = "http://localhost:8100")
public class PatientController {
    //reference from student services
    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @GetMapping
    public List<patient> getPatient(){
        return patientService.getPatient();


    }

//    @GetMapping
//    public List<patient> getPatient() {
//        return patientService.getPatient();
//    }

    @GetMapping("{patient_id}")
    public patient studentPathVariable(@PathVariable("patient_id") Long patient_id){
        return  new patient(patient_id);
    }
}
