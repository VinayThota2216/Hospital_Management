package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PatientRequest;
import com.vinay.hospitalmanagement.dto.PatientResponse;
import com.vinay.hospitalmanagement.entity.Patient;
import com.vinay.hospitalmanagement.exception.PatientAlreadyExistsException;
import com.vinay.hospitalmanagement.exception.PatientNotFoundException;
import com.vinay.hospitalmanagement.mapper.PatientMapper;
import com.vinay.hospitalmanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public PatientResponse create(PatientRequest patientRequest) {

        try {
            Optional<Patient> patient = patientRepository.findByFirstNameAndLastName(patientRequest.getFirstName(), patientRequest.getLastName());

            if (patient.isPresent()) {
                throw new PatientAlreadyExistsException("Patient already exists with this " + patientRequest.getFirstName() + "  " + patientRequest.getLastName());
            }


            Patient patientEntity = PatientMapper.patientRequestToEntity(patientRequest);

            return PatientMapper.patientEntityToResponse(patientRepository.save(patientEntity));
        }
        catch (PatientAlreadyExistsException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
    }

    public PatientResponse update(Long patientId,PatientRequest patientRequest) {

        Optional<Patient> patient = patientRepository.findById(patientId);

        if (patient.isEmpty()) {
            throw new PatientNotFoundException("Patient not found");
        }

        Patient patientEntity = patient.get();

        patientEntity.setFirstName(patientRequest.getFirstName());
        patientEntity.setLastName(patientRequest.getLastName());
        patientEntity.setMobileNumber(patientRequest.getMobileNumber());
        patientEntity.setCity(patientRequest.getCity());
        patientEntity.setAge(patientRequest.getAge());
        patientEntity.setGender(patientRequest.getGender());
        patientEntity.setEmail(patientRequest.getEmail());

        return PatientMapper.patientEntityToResponse(patientRepository.save(patientEntity));
    }

    public PatientResponse delete(Long patientId){

        Optional<Patient> patient = patientRepository.findById(patientId);

        if (patient.isEmpty()) {
            throw new PatientNotFoundException("Patient not found");
        }
        patientRepository.delete(patient.get());
        return PatientMapper.patientEntityToResponse(patient.get());
    }

    public PatientResponse getById(Long patientId){

        Optional<Patient> patient = patientRepository.findById(patientId);

        if (patient.isEmpty()) {
            throw new PatientNotFoundException("Patient not found");
        }
        return PatientMapper.patientEntityToResponse(patient.get());
    }
}
