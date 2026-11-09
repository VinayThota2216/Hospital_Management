package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.DepartmentRequest;
import com.vinay.hospitalmanagement.dto.DepartmentResponse;
import com.vinay.hospitalmanagement.entity.Department;
import com.vinay.hospitalmanagement.exception.DepartmentNotFoundException;
import com.vinay.hospitalmanagement.mapper.DepartmentMapper;
import com.vinay.hospitalmanagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentResponse create(DepartmentRequest departmentRequest){

        Department department= DepartmentMapper.departmentRequestToEntity(departmentRequest);

        return DepartmentMapper.departmentEntityToResponse(departmentRepository.save(department));

    }
    public DepartmentResponse update(Long departmentId,DepartmentRequest departmentRequest){

        Optional<Department> department= departmentRepository.findById(departmentId);

        if(department.isEmpty()){
            throw new DepartmentNotFoundException("Department not found");
        }

        Department departmentEntity =department.get();

        departmentEntity.setDepartmentName(departmentRequest.getDepartmentName());
        departmentEntity.setDescription(departmentRequest.getDescription());


        return DepartmentMapper.departmentEntityToResponse(departmentRepository.save(departmentEntity));



    }
    public DepartmentResponse delete(Long departmentId){
        return null;
    }
    public DepartmentResponse getById(Long departmentId){
        return null;
    }
}
