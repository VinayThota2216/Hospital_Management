package com.vinay.hospitalmanagement.mapper;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.dto.DoctorRequest;
import com.vinay.hospitalmanagement.dto.DoctorResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.entity.Doctor;

public class DoctorMapper {

    public Doctor doctorRequestToEntity(DoctorRequest doctorRequest){

        Doctor doctor = new Doctor();

        doctor.setDoctorName(doctorRequest.getDoctorName());
        doctor.setEmail(doctorRequest.getEmail());
        doctor.setMobileNumber(String.valueOf(doctorRequest.getMobileNumber()));
        doctor.setSpecialization(String.valueOf(doctorRequest.getSpecialization()));

        return doctor;
    }

    public DoctorResponse doctorEntityToResponse(Doctor doctor){

        DoctorResponse doctorResponse = new DoctorResponse();

        doctorResponse.setDoctorId(doctor.getDoctorId());
        doctorResponse.setDoctorName(doctor.getDoctorName());
        doctorResponse.setEmail(doctor.getEmail());
        doctorResponse.setMobileNumber(doctor.getMobileNumber());
        doctorResponse.setSpecialization(doctor.getSpecialization());

        return doctorResponse;
    }
}
