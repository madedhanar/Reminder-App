package com.example.backend.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getDoctor(){
        return doctorRepository.findAll();
    }

    public void addNewDoctor(Doctor doctor) {
        Optional<Doctor> doctorOptional =  doctorRepository.findDoctorByEmail(doctor.getEmail());

        if (doctorOptional.isPresent()){
            throw new IllegalStateException("Email Taken");
        }

        doctorRepository.save(doctor);
    }
}
