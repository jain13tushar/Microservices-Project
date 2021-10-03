package com.microservice.department.service;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service annotation is used with classes that provide some business functionalities.
// Spring context will autodetect these classes when annotation-based configuration
// and classpath scanning is used.
@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
    log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
