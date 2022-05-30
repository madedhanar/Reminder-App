package com.example.backend.doctor;

import com.example.backend.patient.patient;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
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

    public Doctor(Long doctor_id, String doctor_name, String email, String password) {
        this.doctor_id = doctor_id;
        this.doctor_name = doctor_name;
        this.email = email;
        this.password = password;
    }

    public Doctor(String doctor_name, String email, String password) {
        this.doctor_name = doctor_name;
        this.email = email;
        this.password = password;
    }

    public Long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctor_id=" + doctor_id +
                ", doctor_name='" + doctor_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
