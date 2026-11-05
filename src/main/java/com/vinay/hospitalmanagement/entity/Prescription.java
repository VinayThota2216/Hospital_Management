package com.vinay.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "prescription")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescriptionId;

    private Long patientId;
    private Long doctorId;
    private String medicineDetails;
    private Date prescriptionDate;
}
