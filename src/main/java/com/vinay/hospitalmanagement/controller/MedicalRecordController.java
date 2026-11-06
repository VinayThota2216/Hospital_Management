package com.vinay.hospitalmanagement.controller;


import com.vinay.hospitalmanagement.dto.MedicalRecordRequest;
import com.vinay.hospitalmanagement.dto.MedicalRecordResponse;
import com.vinay.hospitalmanagement.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/medicalRecord")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @PostMapping("/createMedicalRecord")
    public MedicalRecordResponse createMedicalRecord(@RequestBody MedicalRecordRequest medicalRecordRequest) {
        return medicalRecordService.create(medicalRecordRequest);
    }

    @GetMapping("/getMedicalRecord/{recordId}")
    public MedicalRecordResponse getMedicalRecord(@PathVariable("recordId") Long recordId) {
        return medicalRecordService.getById(recordId);
    }

    @PutMapping("/updateMedicalRecord/{recordId}")
    public MedicalRecordResponse updateMedicalRecord(@PathVariable("recordId")  Long recordId, @RequestBody MedicalRecordRequest medicalRecordRequest) {
        return medicalRecordService.update(recordId, medicalRecordRequest);
    }

    @DeleteMapping("/deleteMedicalRecord/{recordId}")
    public MedicalRecordResponse deleteMedicalRecord(@PathVariable("recordId") Long recordId) {
        return medicalRecordService.delete(recordId);
    }
}
