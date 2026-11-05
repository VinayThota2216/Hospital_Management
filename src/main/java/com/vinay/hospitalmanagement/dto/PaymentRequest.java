package com.vinay.hospitalmanagement.dto;

import lombok.Data;

@Data
public class PaymentRequest {


    private Long billId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;


}
