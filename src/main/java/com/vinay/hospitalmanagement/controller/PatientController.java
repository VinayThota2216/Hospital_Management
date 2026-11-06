package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;
}
