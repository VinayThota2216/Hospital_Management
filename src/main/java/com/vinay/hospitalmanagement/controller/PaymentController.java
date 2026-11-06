package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
}
