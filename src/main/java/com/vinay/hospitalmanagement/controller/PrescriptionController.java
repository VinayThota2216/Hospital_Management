package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/prescription")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;
}
