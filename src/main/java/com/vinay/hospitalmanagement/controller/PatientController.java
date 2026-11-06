package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.dto.PatientRequest;
import com.vinay.hospitalmanagement.dto.PatientResponse;
import com.vinay.hospitalmanagement.entity.Patient;
import com.vinay.hospitalmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/createPatient")
    public PatientResponse createPatient(@RequestBody PatientRequest patientRequest){
        return patientService.create(patientRequest);
    }

    @GetMapping("/getPatient/{patientId}")
    public PatientResponse getPatient(@PathVariable("patientId") Long patientId){
        return patientService.getById(patientId);
    }

    @PutMapping("/updatePatient/{patientId}")
    public PatientResponse updatePatient(@PathVariable("patientId") Long patientId,@RequestBody PatientRequest patientRequest){
        return patientService.update(patientId,patientRequest);
    }

    @DeleteMapping("/deletePatient/{patientId}")
    public PatientResponse deletePatient(@PathVariable("patientId") Long patientId){
        return patientService.delete(patientId);
    }
    

}
