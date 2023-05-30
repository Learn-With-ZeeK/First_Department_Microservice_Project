package com.zeek.departmentserviceA.service;

import java.util.List;
import java.util.Optional;

import com.zeek.departmentserviceA.entity.Department;


public interface DepartmentService {
	
     Department saveDepartment(Department department);
	
	List<Department> getAllDepartments();
	
	Optional<Department> getDepartmentById(long id);

}
