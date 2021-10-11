package com.hutech.employeeInformation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hutech.employeeInformation.entity.EmployeeInformation;
import com.hutech.employeeInformation.repository.EmployeeRepository;



@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public  List<EmployeeInformation> getAllEmployeeInformation() {
		List<EmployeeInformation> employeeList = (List<EmployeeInformation>) employeeRepository.findAll();
		return employeeList;
	}
	
	//putEmployeeDetails
	public EmployeeInformation addEmployeeInfo(EmployeeInformation emp) {
		return employeeRepository.save(emp);
	}
	
}
