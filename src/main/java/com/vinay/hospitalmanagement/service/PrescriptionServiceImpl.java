package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.PrescriptionRequest;
import com.vinay.hospitalmanagement.dto.PrescriptionResponse;
import com.vinay.hospitalmanagement.entity.Prescription;
import com.vinay.hospitalmanagement.exception.PrescriptionNotFoundException;
import com.vinay.hospitalmanagement.mapper.PrescriptionMapper;
import com.vinay.hospitalmanagement.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public PrescriptionResponse create(PrescriptionRequest prescriptionRequest){

        Prescription prescription= PrescriptionMapper.prescriptionRequestToEntity(prescriptionRequest);

        return PrescriptionMapper.prescriptionEntityToResponse(prescriptionRepository.save(prescription));

    }
    public PrescriptionResponse getById(Long prescriptionId){
        return null;
    }
    public PrescriptionResponse delete(Long prescriptionId){
        return null;
    }
    public PrescriptionResponse update(Long prescriptionId,PrescriptionRequest prescriptionRequest){

        Optional<Prescription> prescription = prescriptionRepository.findById(prescriptionId);

        if(prescription.isEmpty()){
            throw new PrescriptionNotFoundException("Prescription not found");
        }

        Prescription prescriptionEntity = prescription.get();

        prescriptionEntity.setDoctorId(prescriptionRequest.getDoctorId());
        prescriptionEntity.setPatientId(prescriptionRequest.getPatientId());
        prescriptionEntity.setMedicineDetails(prescriptionRequest.getMedicineDetails());
        prescriptionEntity.setPrescriptionDate(prescriptionRequest.getPrescriptionDate());

        return PrescriptionMapper.prescriptionEntityToResponse(prescriptionRepository.save(prescriptionEntity));

    }
}
