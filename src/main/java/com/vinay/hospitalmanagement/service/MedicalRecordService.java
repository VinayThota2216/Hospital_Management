package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.DoctorRequest;
import com.vinay.hospitalmanagement.dto.DoctorResponse;
import com.vinay.hospitalmanagement.dto.MedicalRecordRequest;
import com.vinay.hospitalmanagement.dto.MedicalRecordResponse;
import com.vinay.hospitalmanagement.entity.MedicalRecord;

public interface MedicalRecordService {

    MedicalRecordResponse create(MedicalRecordRequest medicalRecordRequest);
    MedicalRecordResponse update(MedicalRecordRequest medicalRecordRequest,Long recordId);
    MedicalRecordResponse getById(Long recordId);
    MedicalRecordResponse delete(Long recordId);

}
