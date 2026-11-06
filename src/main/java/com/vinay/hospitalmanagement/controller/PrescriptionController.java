package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.dto.PrescriptionRequest;
import com.vinay.hospitalmanagement.dto.PrescriptionResponse;
import com.vinay.hospitalmanagement.entity.Prescription;
import com.vinay.hospitalmanagement.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/prescription")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping("/createPrescription")
    public PrescriptionResponse createPrescription(@RequestBody PrescriptionRequest prescriptionRequest){
        return prescriptionService.create(prescriptionRequest);
    }

    @GetMapping("/getPrescription/{prescriptionId}")
    public PrescriptionResponse getPrescription(@PathVariable Long prescriptionId){
        return prescriptionService.getById(prescriptionId);
    }

    @PutMapping("/updatePrescription/{prescriptionId}")
    public PrescriptionResponse updatePrescription(@PathVariable("prescriptionId") Long prescriptionId,@RequestBody PrescriptionRequest  prescriptionRequest){
        return prescriptionService.update(prescriptionId,prescriptionRequest);
    }

    @GetMapping("/deletePrescription/{prescriptionId}")
    public PrescriptionResponse deletePrescription(@PathVariable Long prescriptionId){
        return prescriptionService.delete(prescriptionId);
    }

}
