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
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor(1L, "Doctor1","doctor1@gmail.com","doctor1"));
        return doctors;
    }


    //Post
    @PostMapping
    public void registerNewDoctor(@RequestBody Doctor doctor){
        doctorService.addNewDoctor(doctor);
    }
}
