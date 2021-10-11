package com.hutech.employeeInformation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hutech.employeeInformation.entity.EmployeeInformation;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeInformation, Long> {
	
}
