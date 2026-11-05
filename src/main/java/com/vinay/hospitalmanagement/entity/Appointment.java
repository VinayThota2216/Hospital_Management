package com.vinay.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    private Long patientId;
    private Long doctorId;
    private Date appointmentDate;
    private String status;
    private String reason;

}
