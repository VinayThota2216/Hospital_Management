package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PaymentRequest;
import com.vinay.hospitalmanagement.dto.PaymentResponse;

public interface PaymentService {

    PaymentResponse create(PaymentRequest paymentRequest);
    PaymentResponse getById(Long paymentId);
    PaymentResponse update(PaymentRequest paymentRequest, Long paymentId);
    PaymentResponse delete(Long paymentId);
}
