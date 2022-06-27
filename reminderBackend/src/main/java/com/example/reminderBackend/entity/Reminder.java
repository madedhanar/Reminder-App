package com.example.reminderBackend.entity;


import lombok.*;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table
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
    private Boolean finishFlag;
    private LocalDateTime finishDate;
    private Boolean isLate;
    private String priority;
    @Column(name = "doctor_id")
    private Long doctor;
    @Column(name = "patient_id")
    private Long patient;


    public void setDuration(Integer duration) {
        this.duration = Math.toIntExact(Duration.between(endDate, startDate).toHoursPart());
    }

    public Boolean setFinishFlag(Boolean finishFlag){
        this.finishFlag = finishFlag;
        return finishFlag;
    }

}
