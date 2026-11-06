package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/createAppoinment")
    public AppointmentResponse createAppointment(@RequestBody AppointmentRequest appointmentRequest) {
        return appointmentService.create(appointmentRequest);
    }

    @GetMapping("/getAppoinment/{appointmentId}")
    public AppointmentResponse getAppointment(@PathVariable("appointmentId") Long appointmentId) {
        return appointmentService.getById(appointmentId);
    }

    @PutMapping("/updateAppointment/{appointmentId}")
    public AppointmentResponse updateAppointment(@PathVariable("appointmentId") Long appointmentId, @RequestBody AppointmentRequest appointmentRequest) {
        return appointmentService.update(appointmentId,appointmentRequest);
    }

    @DeleteMapping("/deleteAppoinment/{appointmentId}")
    public AppointmentResponse deleteAppointment(@PathVariable("appointmentId") Long appointmentId) {
        return appointmentService.delete(appointmentId);
    }


}
