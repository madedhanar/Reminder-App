package com.example.reminderBackend.service;

import com.example.reminderBackend.entity.Patient;
import com.example.reminderBackend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;
    @Override
    public List<Patient> getPatient() {
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> getPatientByDoctorId(Long doctorId) {
        return patientRepository.findPatientByDoctorId(doctorId);
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

}
