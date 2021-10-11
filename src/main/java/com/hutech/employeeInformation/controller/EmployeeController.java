package com.hutech.employeeInformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hutech.employeeInformation.entity.EmployeeInformation;
import com.hutech.employeeInformation.service.EmployeeService;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getemployeeinfo")
	public List<EmployeeInformation> getAllEmployeeInformation() {
		return employeeService.getAllEmployeeInformation();
	}
	
	@PostMapping("/addemployeeinfo")
	public String addEmployeeInfo(@RequestBody EmployeeInformation emp) {
		employeeService.addEmployeeInfo(emp);
		return "Employee details added successfully";
	}
	
	
}
