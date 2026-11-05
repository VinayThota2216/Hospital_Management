package com.vinay.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private int age;
    private String gender;
    private String city;

}
