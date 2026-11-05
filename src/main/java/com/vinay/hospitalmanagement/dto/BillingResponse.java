package com.vinay.hospitalmanagement.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BillingResponse {
    private Long billId;

    private Long patientId;
    private double totalAmount;
    private String billStatus;
    private Date billDate;
}
