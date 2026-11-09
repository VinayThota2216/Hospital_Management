package com.vinay.hospitalmanagement.mapper;

import com.vinay.hospitalmanagement.dto.AppointmentRequest;
import com.vinay.hospitalmanagement.dto.AppointmentResponse;
import com.vinay.hospitalmanagement.dto.DepartmentRequest;
import com.vinay.hospitalmanagement.dto.DepartmentResponse;
import com.vinay.hospitalmanagement.entity.Appointment;
import com.vinay.hospitalmanagement.entity.Department;

public class DepartmentMapper {
    public static Department departmentRequestToEntity(DepartmentRequest departmentRequest){

        Department department = new Department();

        department.setDepartmentName(departmentRequest.getDepartmentName());
        department.setDescription(departmentRequest.getDescription());

        return department;
    }

    public static DepartmentResponse departmentEntityToResponse(Department department){

        DepartmentResponse departmentResponse = new DepartmentResponse();

        departmentResponse.setDepartmentId(department.getDepartmentId());
        departmentResponse.setDepartmentName(department.getDepartmentName());
        departmentResponse.setDescription(department.getDescription());

        return departmentResponse;
    }
}
