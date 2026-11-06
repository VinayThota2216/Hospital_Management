package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;

import java.util.List;

public interface AppointmentService {
    AppointmentResponse create(AppointmentRequest appointmentRequest);
    AppointmentResponse update(Long appointmentId,AppointmentRequest appointmentRequest);
    AppointmentResponse delete(Long appointmentId);
    AppointmentResponse getById(Long appointmentId);

}
