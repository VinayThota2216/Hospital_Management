package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.DoctorRequest;
import com.vinay.hospitalmanagement.dto.DoctorResponse;
import com.vinay.hospitalmanagement.entity.Doctor;
import com.vinay.hospitalmanagement.exception.DoctorNotFoundException;
import com.vinay.hospitalmanagement.mapper.DoctorMapper;
import com.vinay.hospitalmanagement.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public DoctorResponse create(DoctorRequest doctorRequest){

        Doctor doctor= DoctorMapper.doctorRequestToEntity(doctorRequest);

        return DoctorMapper.doctorEntityToResponse(doctorRepository.save(doctor));

    }
    public DoctorResponse update(Long doctorId,DoctorRequest doctorRequest){

        Optional<Doctor> doctor = doctorRepository.findById(doctorId);

        if (doctor.isEmpty()){
            throw new DoctorNotFoundException("Doctor not found");
        }

        Doctor doctorEntity = doctor.get();

        doctorEntity.setMobileNumber(doctorRequest.getMobileNumber());
        doctorEntity.setSpecialization(doctorRequest.getSpecialization());
        doctorEntity.setEmail(doctorRequest.getEmail());
        doctorEntity.setDoctorName(doctorRequest.getDoctorName());

        return DoctorMapper.doctorEntityToResponse(doctorRepository.save(doctorEntity));
    }
    public DoctorResponse delete(Long doctorId){
        return null;
    }
    public DoctorResponse getById(Long doctorId){
        return null;
    }
}
