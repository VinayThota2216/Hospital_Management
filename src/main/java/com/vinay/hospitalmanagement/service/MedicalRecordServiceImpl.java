package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.MedicalRecordRequest;
import com.vinay.hospitalmanagement.dto.MedicalRecordResponse;
import com.vinay.hospitalmanagement.entity.MedicalRecord;
import com.vinay.hospitalmanagement.mapper.MedicalRecordMapper;
import com.vinay.hospitalmanagement.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    public MedicalRecordResponse create(MedicalRecordRequest medicalRecordRequest){

        MedicalRecord medicalRecord= MedicalRecordMapper.medicalRecordRequestToEntity(medicalRecordRequest);

        return MedicalRecordMapper.medicalRecordEntityToResponse(medicalRecordRepository.save(medicalRecord));

    }
    public MedicalRecordResponse update(Long recordId,MedicalRecordRequest medicalRecordRequest){
        return null;
    }
    public MedicalRecordResponse getById(Long recordId){
        return null;
    }
    public MedicalRecordResponse delete(Long recordId){
        return null;
    }
}
