package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.DepartmentRequest;
import com.vinay.hospitalmanagement.dto.DepartmentResponse;
import com.vinay.hospitalmanagement.entity.Department;
import com.vinay.hospitalmanagement.mapper.DepartmentMapper;
import com.vinay.hospitalmanagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentResponse create(DepartmentRequest departmentRequest){

        Department department= DepartmentMapper.departmentRequestToEntity(departmentRequest);

        return DepartmentMapper.departmentEntityToResponse(departmentRepository.save(department));
    }
    public DepartmentResponse update(Long departmentId,DepartmentRequest departmentRequest){
        return null;
    }
    public DepartmentResponse delete(Long departmentId){
        return null;
    }
    public DepartmentResponse getById(Long departmentId){
        return null;
    }
}
