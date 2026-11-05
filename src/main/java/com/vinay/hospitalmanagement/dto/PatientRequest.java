package com.vinay.hospitalmanagement.dto;

import lombok.Data;

@Data
public class PatientRequest {


    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private int age;
    private String gender;
    private String city;
}
