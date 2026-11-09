package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.DoctorRequest;
import com.vinay.hospitalmanagement.dto.DoctorResponse;
import com.vinay.hospitalmanagement.entity.Doctor;
import com.vinay.hospitalmanagement.mapper.DoctorMapper;
import com.vinay.hospitalmanagement.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public DoctorResponse create(DoctorRequest doctorRequest){

        Doctor doctor= DoctorMapper.doctorRequestToEntity(doctorRequest);

        return DoctorMapper.doctorEntityToResponse(doctorRepository.save(doctor));

    }
    public DoctorResponse update(Long doctorId,DoctorRequest doctorRequest){
        return null;
    }
    public DoctorResponse delete(Long doctorId){
        return null;
    }
    public DoctorResponse getById(Long doctorId){
        return null;
    }
}
