package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PatientRequest;
import com.vinay.hospitalmanagement.dto.PatientResponse;

public interface PatientService {

    PatientResponse create(PatientRequest patientRequest);
    PatientResponse update(PatientRequest patientRequest, Long patientId);
    PatientResponse delete(Long patientId);
    PatientResponse getById(Long patientId);
}
