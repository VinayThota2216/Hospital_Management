package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.BillingRequest;
import com.vinay.hospitalmanagement.dto.BillingResponse;
import com.vinay.hospitalmanagement.entity.Billing;
import com.vinay.hospitalmanagement.mapper.BillingMapper;
import com.vinay.hospitalmanagement.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceImpl implements BillingService {

    @Autowired
    private BillingRepository billingRepository;

    public BillingResponse create(BillingRequest billingRequest){

        Billing billing= BillingMapper.billingRequestToEntity(billingRequest);

        return BillingMapper.billingEntityToResponse(billingRepository.save(billing));
    }
    public BillingResponse update(Long billingId,BillingRequest billingRequest){
        return null;
    }
    public BillingResponse delete(Long billingId){
        return null;
    }
    public BillingResponse getById(Long billingId){
        return null;
    }
}
