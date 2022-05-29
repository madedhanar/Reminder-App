package com.example.backend.doctor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getDoctor(){
        return doctorRepository.findAll();
    }

    public void addNewDoctor(Doctor doctor) {
        System.out.println(doctor);
    }
}
