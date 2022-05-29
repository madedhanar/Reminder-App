package com.example.backend.doctor;

import com.example.backend.patient.patient;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Doctor {
    @Id
    @SequenceGenerator(
            name = "doctor_sequence",
            sequenceName = "doctor_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "doctor_sequence"

    )
    private Long doctor_id;
    private String doctor_name;
    private String email;
    private String password;

    private Long patient_list_id;

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
