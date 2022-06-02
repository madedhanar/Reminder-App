package com.example.reminderBackend.entity;


import com.example.reminderBackend.repository.ReminderRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table
@CrossOrigin("http://localhost:4200")
//@Table(
//        name = "tbl_reminder",
//        uniqueConstraints = @UniqueConstraint(
//
//        )
//)
public class Reminder {

    @Id
    @SequenceGenerator(
            name = "sequence_generator",
            sequenceName = "sequence_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence_generator"
    )
    private Long reminderId;
    private String reminderTitle;
    private String reminderDescription;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer duration;
    private Integer finishFlag;
    private String priority;
    @Column(name = "doctor_id")
    private Long doctor;
    @Column(name = "patient_id")
    private Long patient;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name ="doctor_id",
            insertable = false,
            updatable = false
    )
    private Doctor doctorId;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "patient_id",
            insertable = false,
            updatable = false
    )
    private Patient patientId;
}
