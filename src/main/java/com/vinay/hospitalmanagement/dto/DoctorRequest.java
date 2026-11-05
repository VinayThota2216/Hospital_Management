package com.vinay.hospitalmanagement.dto;

import lombok.Data;

@Data
public class DoctorRequest {

    private String doctorName;
    private String email;
    private String mobileNumber;
    private String specialization;
}
