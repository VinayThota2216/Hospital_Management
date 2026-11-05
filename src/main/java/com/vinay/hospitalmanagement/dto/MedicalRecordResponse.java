package com.vinay.hospitalmanagement.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MedicalRecordResponse {
    private Long recordId;
    private Long patientId;
    private Long doctorId;
    private String diagnosis;
    private String treatment;
    private Date recordDate;
}
