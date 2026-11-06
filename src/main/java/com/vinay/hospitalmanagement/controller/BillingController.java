package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.dto.BillingRequest;
import com.vinay.hospitalmanagement.dto.BillingResponse;
import com.vinay.hospitalmanagement.entity.Billing;
import com.vinay.hospitalmanagement.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping("/createBilling")
    public BillingResponse createBilling(@RequestBody BillingRequest billingRequest) {
        return billingService.create(billingRequest);
    }

    @GetMapping("/getBilling/{billingId}")
    public BillingResponse getBilling(@PathVariable("billingId") Long billingId) {
        return billingService.getById(billingId);
    }

    @PutMapping("/updateBilling/{billingId}")
    public BillingResponse updateBilling(@PathVariable("billingId") Long billingId, @RequestBody BillingRequest billingRequest) {
        return billingService.update(billingId, billingRequest);
    }

    @DeleteMapping("/deleteBilling/{billingId}")
    public BillingResponse deleteBilling(@PathVariable("billingId") Long billingId) {
        return billingService.delete(billingId);
    }
}
