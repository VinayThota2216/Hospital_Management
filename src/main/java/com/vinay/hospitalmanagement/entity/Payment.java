package com.vinay.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private Long billId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;

}
