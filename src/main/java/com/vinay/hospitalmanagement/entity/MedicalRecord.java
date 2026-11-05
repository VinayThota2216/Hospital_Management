package com.vinay.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "medical_record")
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;
    private Long patientId;
    private Long doctorId;
    private String diagnosis;
    private String treatment;
    private Date recordDate;

}
