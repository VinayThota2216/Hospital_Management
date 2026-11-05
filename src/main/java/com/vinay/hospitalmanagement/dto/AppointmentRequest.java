package com.vinay.hospitalmanagement.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AppointmentRequest {

    private Long patientId;
    private Long doctorId;
    private Date appointmentDate;
    private String status;
    private String reason;
}
