package com.vinay.hospitalmanagement.mapper;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.dto.PatientRequest;
import com.vinay.hospitalmanagement.dto.PatientResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.entity.Patient;

public class PatientMapper {
    public Patient patientRequestToEntity(PatientRequest patientRequest){

        Patient patient = new Patient();

        patient.setFirstName(patientRequest.getFirstName());
        patient.setLastName(patientRequest.getLastName());
        patient.setGender(patientRequest.getGender());
        patient.setMobileNumber(String.valueOf(patientRequest.getMobileNumber()));
        patient.setEmail(patientRequest.getEmail());
        patient.setAge(patientRequest.getAge());
        patient.setCity(patientRequest.getCity());

        return patient;

    }

    public PatientResponse patientEntityToResponse(Patient patient){

        PatientResponse patientResponse = new PatientResponse();

        patientResponse.setPatientId(patient.getPatientId());
        patientResponse.setFirstName(patient.getFirstName());
        patientResponse.setLastName(patient.getLastName());
        patientResponse.setGender(patient.getGender());
        patientResponse.setMobileNumber(patient.getMobileNumber());
        patientResponse.setEmail(patient.getEmail());
        patientResponse.setAge(patient.getAge());
        patientResponse.setCity(patient.getCity());

        return patientResponse;
    }
}
