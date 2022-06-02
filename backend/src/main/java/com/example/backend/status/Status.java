package com.example.backend.status;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Status {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long status_id;
    private String status_name;

    public Status() {
    }

    public Status(Long status_id, String status_name) {
        this.status_id = status_id;
        this.status_name = status_name;
    }
}
