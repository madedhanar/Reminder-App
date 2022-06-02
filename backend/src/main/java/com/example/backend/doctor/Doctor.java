package com.example.backend.doctor;

import com.example.backend.patient.patient;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table
public class Doctor {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO

    )
    private Long doctor_id;
    private String doctor_name;
    private String email;
    private String password;


    @OneToMany(mappedBy = "doctors")
    private List<patient> patients = new ArrayList<>();

    public List<patient> getPatients() {
        return patients;
    }

    public void setPatients(List<patient> patients) {
        this.patients = patients;
    }

    public Doctor() {
    }

    public Doctor(String doctor_name, String email, String password) {
        this.doctor_name = doctor_name;
        this.email = email;
        this.password = password;
    }
}
