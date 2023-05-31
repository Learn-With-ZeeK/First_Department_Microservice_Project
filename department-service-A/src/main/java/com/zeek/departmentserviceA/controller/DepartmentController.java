package com.zeek.departmentserviceA.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeek.departmentserviceA.entity.Department;
import com.zeek.departmentserviceA.service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

	private DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	// build create department REST API
	// http://localhost:8080/departments------- POST request on Postman App

	@PostMapping()
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {

		return new ResponseEntity<Department>(departmentService.saveDepartment(department), HttpStatus.CREATED);
	}

	// build get all departments REST API
	// http://localhost:8080/departments------- GET request on Postman App
	
	@GetMapping
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}
	
	// build get department by id REST API
		// http://localhost:8080/departments/1---------- GET request on Postman App
			
		@GetMapping("{id}")
			public Department getDepartmentById(@PathVariable("id") long departmentId){
			 return departmentService.findDepartmentById(departmentId);
		}

}
