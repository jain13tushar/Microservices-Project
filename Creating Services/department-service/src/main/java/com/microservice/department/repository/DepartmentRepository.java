package com.microservice.department.repository;

import com.microservice.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that indicates that the decorated class is a repository.
// A repository is a mechanism for encapsulating storage, retrieval, and search behavior
// which emulates a collection of objects.
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentId(Long departmentId);
}
