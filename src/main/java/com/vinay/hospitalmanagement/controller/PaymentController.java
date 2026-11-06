package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.dto.PaymentRequest;
import com.vinay.hospitalmanagement.dto.PaymentResponse;
import com.vinay.hospitalmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/createPayment")
    public PaymentResponse createPayment(@RequestBody PaymentRequest paymentRequest){
        return paymentService.create(paymentRequest);
    }

    @GetMapping("/getPayment/{paymentId}")
    public PaymentResponse getPayment(@PathVariable("paymentId") Long paymentId){
        return paymentService.getById(paymentId);
    }

    @PutMapping("/updatePayment/{paymentId}")
    public PaymentResponse updatePayment(@PathVariable("paymentId") Long paymentId,@RequestBody PaymentRequest paymentRequest){
        return paymentService.update(paymentId,paymentRequest);
    }

    @DeleteMapping("/deletePayment/{paymentId}")
    public PaymentResponse deletePayment(@PathVariable("paymentId") Long paymentId){
        return paymentService.delete(paymentId);
    }
}
