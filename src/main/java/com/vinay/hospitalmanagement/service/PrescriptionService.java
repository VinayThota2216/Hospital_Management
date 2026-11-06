package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PaymentRequest;
import com.vinay.hospitalmanagement.dto.PaymentResponse;
import com.vinay.hospitalmanagement.dto.PrescriptionRequest;
import com.vinay.hospitalmanagement.dto.PrescriptionResponse;

public interface PrescriptionService {

    PrescriptionResponse create(PrescriptionRequest prescriptionRequest);
    PrescriptionResponse getById(Long prescriptionId);
    PrescriptionResponse delete(Long prescriptionId);
    PrescriptionResponse update(Long prescriptionId,PrescriptionRequest prescriptionRequest);
}
