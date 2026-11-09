package com.vinay.hospitalmanagement.mapper;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.dto.PrescriptionRequest;
import com.vinay.hospitalmanagement.dto.PrescriptionResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.entity.Prescription;

public class PrescriptionMapper {
    public static Prescription prescriptionRequestToEntity(PrescriptionRequest prescriptionRequest){

        Prescription prescription = new Prescription();

        prescription.setDoctorId(prescriptionRequest.getDoctorId());
        prescription.setMedicineDetails(prescriptionRequest.getMedicineDetails());
        prescription.setPatientId(prescriptionRequest.getPatientId());
        prescription.setPrescriptionDate(prescriptionRequest.getPrescriptionDate());

        return prescription;
    }

    public static PrescriptionResponse prescriptionEntityToResponse(Prescription prescription){

        PrescriptionResponse prescriptionResponse = new PrescriptionResponse();

        prescriptionResponse.setPrescriptionId(prescription.getPrescriptionId());
        prescriptionResponse.setDoctorId(prescription.getDoctorId());
        prescriptionResponse.setPrescriptionDate(prescription.getPrescriptionDate());
        prescriptionResponse.setPatientId(prescription.getPatientId());
        prescriptionResponse.setMedicineDetails(prescription.getMedicineDetails());

        return prescriptionResponse;
    }
}
