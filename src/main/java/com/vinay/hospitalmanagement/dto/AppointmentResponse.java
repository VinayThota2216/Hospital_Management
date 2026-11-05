package com.vinay.hospitalmanagement.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AppointmentResponse {

    private Long appointmentId;

    private Long patientId;
    private Long doctorId;
    private Date appointmentDate;
    private String status;
    private String reason;
}
