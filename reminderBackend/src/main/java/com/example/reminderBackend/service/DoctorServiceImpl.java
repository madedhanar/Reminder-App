package com.example.reminderBackend.service;

import com.example.reminderBackend.entity.Doctor;
import com.example.reminderBackend.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public ResponseEntity<Doctor> login(Doctor doctor) {
        Doctor email = doctorRepository.findByEmail(doctor.getEmail());
        if(email.getPassword().equals(doctor.getPassword())){
            return ResponseEntity.ok(email);
        }else {
            return (ResponseEntity<Doctor>) ResponseEntity.internalServerError();
        }
    }
}
