package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;

import java.util.List;

public interface AppointmentService {
    AppointmentResponse create(AppointmentRequest appointmentRequest);
    AppointmentResponse update(AppointmentRequest appointmentRequest,Long appointmentId);
    AppointmentResponse delete(Long appointmentId);
    AppointmentResponse getById(Long appointmentId);

}
