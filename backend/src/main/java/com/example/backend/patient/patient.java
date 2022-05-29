package com.example.backend.patient;

import com.example.backend.doctor.Doctor;
import jakarta.persistence.*;

@Entity
@Table
public class patient {
    @Id
    @SequenceGenerator(
            name = "patient_sequence",
            sequenceName = "patient_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_sequence"
    )
    private Long patient_id;
    private String patient_name;
    private String email;
    private String password;

    @ManyToOne
    private Doctor doctors;

    public patient() {
    }

    public patient(Long patient_id) {
    }

    public patient(Long patient_id, String patient_name, String email, String password) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.email = email;
        this.password = password;
    }

    public patient(String patient_name, String email, String password) {
        this.patient_name = patient_name;
        this.email = email;
        this.password = password;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
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
        return "patient{" +
                "patient_id=" + patient_id +
                ", patient_name='" + patient_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}




