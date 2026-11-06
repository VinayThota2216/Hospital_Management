package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.DoctorRequest;
import com.vinay.hospitalmanagement.dto.DoctorResponse;

public interface DoctorService {

    DoctorResponse create(DoctorRequest doctorRequest);
    DoctorResponse update(Long doctorId,DoctorRequest doctorRequest);
    DoctorResponse delete(Long doctorId);
    DoctorResponse getById(Long doctorId);
}
