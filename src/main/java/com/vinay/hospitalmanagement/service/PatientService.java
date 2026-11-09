package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PatientRequest;
import com.vinay.hospitalmanagement.dto.PatientResponse;
import com.vinay.hospitalmanagement.exception.PatientAlreadyExistsException;

public interface PatientService {

    PatientResponse create(PatientRequest patientRequest);
    PatientResponse update(Long patientId,PatientRequest patientRequest);
    PatientResponse delete(Long patientId);
    PatientResponse getById(Long patientId);
}
