package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {



    public AppointmentResponse create(AppointmentRequest appointmentRequest){
        return null;
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
