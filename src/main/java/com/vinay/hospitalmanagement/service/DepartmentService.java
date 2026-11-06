package com.vinay.hospitalmanagement.service;

import com.vinay.hospitalmanagement.dto.DepartmentRequest;
import com.vinay.hospitalmanagement.dto.DepartmentResponse;

public interface DepartmentService {

    DepartmentResponse create(DepartmentRequest departmentRequest);
    DepartmentResponse update(DepartmentRequest departmentRequest, Long departmentId);
    DepartmentResponse delete(Long departmentId);
    DepartmentResponse getById(Long departmentId);
}
