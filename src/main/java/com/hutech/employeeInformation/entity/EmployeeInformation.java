package com.hutech.employeeInformation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_information")
public class EmployeeInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	public Long id;
	
	@Column(name="EmployeeName")
	public String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employee_salary_id")
    private EmployeeSalary employee_salary;


	public EmployeeSalary getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(EmployeeSalary employee_salary) {
		this.employee_salary = employee_salary;
	}

	public EmployeeInformation() {}
	
	public EmployeeInformation(Long id, String name,EmployeeSalary employee_salary) {
		this.id=id;
		this.name = name;
		this.employee_salary=employee_salary;
	}
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "EmployeeInformation [id=" + id + ", name=" + name + "]";
	}
	
}
