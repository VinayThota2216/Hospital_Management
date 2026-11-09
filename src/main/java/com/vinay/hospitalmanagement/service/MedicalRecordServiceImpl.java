package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.MedicalRecordRequest;
import com.vinay.hospitalmanagement.dto.MedicalRecordResponse;
import com.vinay.hospitalmanagement.entity.MedicalRecord;
import com.vinay.hospitalmanagement.exception.MedicalRecordNotFoundException;
import com.vinay.hospitalmanagement.mapper.MedicalRecordMapper;
import com.vinay.hospitalmanagement.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    public MedicalRecordResponse create(MedicalRecordRequest medicalRecordRequest){

        MedicalRecord medicalRecord= MedicalRecordMapper.medicalRecordRequestToEntity(medicalRecordRequest);

        return MedicalRecordMapper.medicalRecordEntityToResponse(medicalRecordRepository.save(medicalRecord));

    }
    public MedicalRecordResponse update(Long recordId,MedicalRecordRequest medicalRecordRequest){

        Optional<MedicalRecord> medicalRecord= medicalRecordRepository.findById(recordId);

        if(medicalRecord.isEmpty()){
            throw new MedicalRecordNotFoundException("Record not found");
        }

        MedicalRecord medicalRecordEntity = medicalRecord.get();

        medicalRecordEntity.setDoctorId(medicalRecordRequest.getDoctorId());
        medicalRecordEntity.setPatientId(medicalRecordRequest.getPatientId());
        medicalRecordEntity.setTreatment(medicalRecordRequest.getTreatment());
        medicalRecordEntity.setDiagnosis(medicalRecordRequest.getDiagnosis());
        medicalRecordEntity.setRecordDate(medicalRecordRequest.getRecordDate());

        return  MedicalRecordMapper.medicalRecordEntityToResponse(medicalRecordRepository.save(medicalRecordEntity));
    }
    public MedicalRecordResponse getById(Long recordId){
        return null;
    }
    public MedicalRecordResponse delete(Long recordId){
        return null;
    }
}
