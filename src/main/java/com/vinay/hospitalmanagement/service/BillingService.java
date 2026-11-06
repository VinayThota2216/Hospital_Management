package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.BillingRequest;
import com.vinay.hospitalmanagement.dto.BillingResponse;
import com.vinay.hospitalmanagement.entity.Billing;

public interface BillingService {

    BillingResponse create(BillingRequest billingRequest);
    BillingResponse update(BillingRequest billingRequest, Long billingId);
    BillingResponse delete(Long billingId);
    BillingResponse getById(Long billingId);
}
