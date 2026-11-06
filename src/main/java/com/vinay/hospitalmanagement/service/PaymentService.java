package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PaymentRequest;
import com.vinay.hospitalmanagement.dto.PaymentResponse;

public interface PaymentService {

    PaymentResponse create(PaymentRequest paymentRequest);
    PaymentResponse getById(Long paymentId);
    PaymentResponse update(Long paymentId,PaymentRequest paymentRequest);
    PaymentResponse delete(Long paymentId);
}
