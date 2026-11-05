package com.vinay.hospitalmanagement.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PrescriptionResponse {
    private Long prescriptionId;

    private Long patientId;
    private Long doctorId;
    private String medicineDetails;
    private Date prescriptionDate;
}
