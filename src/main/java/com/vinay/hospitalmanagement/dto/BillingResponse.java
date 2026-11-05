package com.vinay.hospitalmanagement.dto;

import java.util.Date;

public class BillingResponse {
    private Long billId;

    private Long patientId;
    private double totalAmount;
    private String billStatus;
    private Date billDate;
}
