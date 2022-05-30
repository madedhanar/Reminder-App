package com.example.backend.doctor;

import com.example.backend.patient.patient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")
@CrossOrigin(origins = "http://localhost:8100")
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


    @PutMapping(path = "{doctor_id}")
    public void updateStudent(@PathVariable("doctor_id")Long doctor_id,
                              @RequestParam(required = false)String name,
                              @RequestParam(required = false)String email){
        doctorService.updateDoctor(doctor_id,name,email);

    }
}
