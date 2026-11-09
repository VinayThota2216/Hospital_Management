package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PatientRequest;
import com.vinay.hospitalmanagement.dto.PatientResponse;
import com.vinay.hospitalmanagement.entity.Patient;
import com.vinay.hospitalmanagement.mapper.PatientMapper;
import com.vinay.hospitalmanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public PatientResponse create(PatientRequest patientRequest){

        Patient patient= PatientMapper.patientRequestToEntity(patientRequest);

        return PatientMapper.patientEntityToResponse(patientRepository.save(patient));

    }
    public PatientResponse update(Long patientId,PatientRequest patientRequest){
        return null;
    }
    public PatientResponse delete(Long patientId){
        return null;
    }
    public PatientResponse getById(Long patientId){
        return null;
    }
}
