package com.example.reminderBackend.service;

import com.example.reminderBackend.entity.Patient;

import java.util.List;

public interface PatientService {


  public List<Patient> getPatient();

   public List<Patient> getPatientByDoctorId(Long doctorId);

    Patient savePatient(Patient patient);
}
