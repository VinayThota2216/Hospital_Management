package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.dto.DoctorRequest;
import com.vinay.hospitalmanagement.dto.DoctorResponse;
import com.vinay.hospitalmanagement.entity.Doctor;
import com.vinay.hospitalmanagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/createDoctor")
    public DoctorResponse createDoctor(@RequestBody DoctorRequest doctorRequest) {
        return doctorService.create(doctorRequest);
    }

    @GetMapping("/getDoctor/{doctorId}")
    public DoctorResponse getDoctor(@PathVariable("doctorId") Long doctorId) {
        return doctorService.getById(doctorId);
    }

    @PutMapping("/updateDoctor/{doctorId}")
    public DoctorResponse updateDoctor(@PathVariable("doctorId") Long doctorId, @RequestBody DoctorRequest doctorRequest) {
        return doctorService.update(doctorId, doctorRequest);
    }

    @DeleteMapping("/deleteDoctor/{doctorId}")
    public DoctorResponse deleteDoctor(@PathVariable("doctorId") Long doctorId) {
        return doctorService.delete(doctorId);
    }

}
