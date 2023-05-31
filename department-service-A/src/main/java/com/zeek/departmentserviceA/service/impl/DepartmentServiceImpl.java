package com.zeek.departmentserviceA.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zeek.departmentserviceA.entity.Department;
import com.zeek.departmentserviceA.repository.DepartmentRepository;
import com.zeek.departmentserviceA.service.DepartmentService;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	
private DepartmentRepository departmentRepository;
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

    @Override
	public Department saveDepartment(Department department) {
	return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department findDepartmentById(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
