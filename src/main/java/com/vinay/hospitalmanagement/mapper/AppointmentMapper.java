package com.vinay.hospitalmanagement.mapper;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.entity.Appointment;

public class AppointmentMapper {

    public static Appointment appointmentRequestToEntity(AppointmentRequest appointmentRequest){
        Appointment appointment = new Appointment();

        appointment.setAppointmentDate(appointmentRequest.getAppointmentDate());
        appointment.setDoctorId(appointmentRequest.getDoctorId());
        appointment.setPatientId(appointmentRequest.getPatientId());
        appointment.setReason(appointmentRequest.getReason());
        appointment.setStatus(appointmentRequest.getStatus());

        return appointment;
    }

    public static AppointmentResponse appointmentEntityToResponse(Appointment appointment){

        AppointmentResponse appointmentResponse = new AppointmentResponse();

        appointmentResponse.setAppointmentId(appointment.getAppointmentId());
        appointmentResponse.setAppointmentDate(appointment.getAppointmentDate());
        appointmentResponse.setDoctorId(appointment.getDoctorId());
        appointmentResponse.setPatientId(appointment.getPatientId());
        appointmentResponse.setReason(appointment.getReason());
        appointmentResponse.setStatus(appointment.getStatus());

        return appointmentResponse;
    }
}
