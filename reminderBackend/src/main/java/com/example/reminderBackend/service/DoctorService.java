package com.example.reminderBackend.service;

import com.example.reminderBackend.entity.Doctor;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DoctorService {

    public List<Doctor> getDoctor();

    public ResponseEntity<Doctor> login(Doctor doctor);
}
