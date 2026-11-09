package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.exception.AppointmentNotFoundException;
import com.vinay.hospitalmanagement.mapper.AppointmentMapper;

import com.vinay.hospitalmanagement.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;



    public AppointmentResponse create(AppointmentRequest appointmentRequest){

        Appointment appointment= AppointmentMapper.appointmentRequestToEntity(appointmentRequest);

        return AppointmentMapper.appointmentEntityToResponse(appointmentRepository.save(appointment));

    }


    public AppointmentResponse update(Long appointmentId, AppointmentRequest appointmentRequest) {

        Optional<Appointment> appointment = appointmentRepository.findById(appointmentId);

        if(appointment.isEmpty()){
            throw new AppointmentNotFoundException("appointment not found");
        }

        Appointment appointmentEntity = appointment.get();

        appointmentEntity.setPatientId(appointmentRequest.getPatientId());
        appointmentEntity.setAppointmentDate(appointmentRequest.getAppointmentDate());
        appointmentEntity.setStatus(appointmentRequest.getStatus());
        appointmentEntity.setDoctorId(appointmentRequest.getDoctorId());
        appointmentEntity.setReason(appointmentRequest.getReason());


        return AppointmentMapper.appointmentEntityToResponse(appointmentRepository.save(appointmentEntity));


    }

    public AppointmentResponse delete(Long appointmentId){

        return null;
    }
    public AppointmentResponse getById(Long appointmentId){

        return null;
    }
}
