package com.vinay.hospitalmanagement.dto;

import java.util.Date;

public class MedicalRecordRequest {

    private Long patientId;
    private Long doctorId;
    private String diagnosis;
    private String treatment;
    private Date recordDate;
}
