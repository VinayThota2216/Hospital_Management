package com.vinay.hospitalmanagement.mapper;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.dto.MedicalRecordRequest;
import com.vinay.hospitalmanagement.dto.MedicalRecordResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.entity.MedicalRecord;

public class MedicalRecordMapper {

    public static MedicalRecord medicalRecordRequestToEntity(MedicalRecordRequest medicalRecordRequest){

        MedicalRecord medicalRecord = new MedicalRecord();

        medicalRecord.setDoctorId(medicalRecordRequest.getDoctorId());
        medicalRecord.setPatientId(medicalRecordRequest.getPatientId());
        medicalRecord.setDiagnosis( medicalRecordRequest.getDiagnosis());
        medicalRecord.setRecordDate(medicalRecordRequest.getRecordDate());
        medicalRecord.setTreatment(medicalRecordRequest.getTreatment());

        return medicalRecord;

    }

    public static MedicalRecordResponse medicalRecordEntityToResponse(MedicalRecord medicalRecord){

        MedicalRecordResponse medicalRecordResponse = new MedicalRecordResponse();

        medicalRecord.setRecordId(medicalRecord.getRecordId());
        medicalRecordResponse.setDoctorId(medicalRecord.getDoctorId());
        medicalRecordResponse.setPatientId(medicalRecord.getPatientId());
        medicalRecordResponse.setDiagnosis(medicalRecord.getDiagnosis());
        medicalRecordResponse.setRecordDate(medicalRecord.getRecordDate());
        medicalRecordResponse.setTreatment(medicalRecord.getTreatment());

        return medicalRecordResponse;
    }
}
