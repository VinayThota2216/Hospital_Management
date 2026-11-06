package com.vinay.hospitalmanagement.controller;

import com.vinay.hospitalmanagement.dto.DepartmentRequest;
import com.vinay.hospitalmanagement.dto.DepartmentResponse;
import com.vinay.hospitalmanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/createDepartment")
    public DepartmentResponse createDepartment(@RequestBody DepartmentRequest departmentRequest) {
        return departmentService.create(departmentRequest);
    }

    @GetMapping("/getDepartment/{departmentId}")
    public DepartmentResponse getDepartment(@PathVariable Long departmentId) {
        return departmentService.getById(departmentId);
    }

    @PutMapping("/updateDepartment/{departmentId}")
    public DepartmentResponse updateDepartment(@PathVariable Long departmentId, @RequestBody DepartmentRequest departmentRequest) {
        return departmentService.update(departmentId, departmentRequest);
    }

    @DeleteMapping("/deleteDepartment/{departmentId}")
    public DepartmentResponse deleteDepartment(@PathVariable Long departmentId) {
        return departmentService.delete(departmentId);
    }



}
