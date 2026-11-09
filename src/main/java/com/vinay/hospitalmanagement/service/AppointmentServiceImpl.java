package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.mapper.AppointmentMapper;

import com.vinay.hospitalmanagement.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;



    public AppointmentResponse create(AppointmentRequest appointmentRequest){

        Appointment appointment= AppointmentMapper.appointmentRequestToEntity(appointmentRequest);

        return AppointmentMapper.appointmentEntityToResponse(appointmentRepository.save(appointment));

    }


    public AppointmentResponse update(Long appointmentId, AppointmentRequest appointmentRequest) {
        return null;
    }

    public AppointmentResponse delete(Long appointmentId){

        return null;
    }
    public AppointmentResponse getById(Long appointmentId){

        return null;
    }
}
