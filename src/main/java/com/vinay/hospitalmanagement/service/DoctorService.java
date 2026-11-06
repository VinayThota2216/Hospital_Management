package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.DoctorRequest;
import com.vinay.hospitalmanagement.dto.DoctorResponse;

public interface DoctorService {

    DoctorResponse create(DoctorRequest doctorRequest);
    DoctorResponse update(DoctorRequest doctorRequest,Long doctorId);
    DoctorResponse delete(Long doctorId);
    DoctorResponse getById(Long doctorId);
}
