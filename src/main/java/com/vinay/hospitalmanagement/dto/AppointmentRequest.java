package com.vinay.hospitalmanagement.dto;

import java.util.Date;

public class AppointmentRequest {

    private Long patientId;
    private Long doctorId;
    private Date appointmentDate;
    private String status;
    private String reason;
}
