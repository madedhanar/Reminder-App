package com.example.backend.doctor;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.Objects;
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
    @Transactional
    public void updateDoctor(Long doctor_id,
                             String name,
                             String email) {
        Doctor doctor = doctorRepository.findById(doctor_id).orElseThrow(
                () -> new IllegalStateException(
                        "Doctor with id" + doctor_id + " does not exist")
        );

        if(name!=null && name.length() >0 && !Objects.equals(doctor.getDoctor_name(), name)){
            doctor.setDoctor_name(name);
        }

        if(email!=null && email.length() >0 && !Objects.equals(doctor.getEmail(), email)){
            doctor.setEmail(email);
        }
    }
}
