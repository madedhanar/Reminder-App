package com.example.reminderBackend.service;

import com.example.reminderBackend.entity.Doctor;

import java.util.List;

public interface DoctorService {
    public Doctor saveDoctor(Doctor doctor);

    public List<Doctor> getDoctor();
}
