package com.vinay.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "billing")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;

    private Long patientId;
    private double totalAmount;
    private String billStatus;
    private Date billDate;
}
