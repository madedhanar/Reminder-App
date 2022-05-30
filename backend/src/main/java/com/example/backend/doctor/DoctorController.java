package com.example.backend.doctor;

import com.example.backend.patient.patient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")
public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    //Get
    @GetMapping
    public List<Doctor> getDoctor(){
        return doctorService.getDoctor();
    }


    //Post
    @PostMapping
        public void registerNewDoctor(@RequestBody Doctor doctor){
        doctorService.addNewDoctor(doctor);
    }
}
