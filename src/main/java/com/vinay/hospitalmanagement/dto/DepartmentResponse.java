package com.vinay.hospitalmanagement.dto;

import lombok.Data;

@Data
public class DepartmentResponse {
    private Long departmentId;
    private String departmentName;
    private String description;
}
