package com.vinay.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;
    private String doctorName;
    private String email;
    private String mobileNumber;
    private String specialization;
}
