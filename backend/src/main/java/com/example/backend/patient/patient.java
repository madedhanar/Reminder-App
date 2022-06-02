package com.example.backend.patient;

import com.example.backend.doctor.Doctor;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class patient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
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

    public patient(String patient_name, String email, String password) {
        this.patient_name = patient_name;
        this.email = email;
        this.password = password;
    }
}




