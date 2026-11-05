package com.vinay.hospitalmanagement.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MedicalRecordRequest {

    private Long patientId;
    private Long doctorId;
    private String diagnosis;
    private String treatment;
    private Date recordDate;
}
