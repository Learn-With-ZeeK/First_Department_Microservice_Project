package com.zeek.departmentserviceA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeek.departmentserviceA.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

  Department findByDepartmentId(Long departmentId);
  
}
