package com.hutech.employeeInformation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="employee_salary")
public class EmployeeSalary {
	
	@Id
	@Column(name="id")
	@SequenceGenerator(initialValue=1, name="employee_salary_seq", sequenceName="employee_salary_sequence")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="employee_salary_seq")
	private Long id;
	
	@Column(name="salary_date")
	public Date date;
	
	@Column(name="salary")
	public Long salary;
	
	
	private EmployeeInformation employeeInformation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}

	public void setEmployeeInformation(EmployeeInformation employeeInformation) {
		this.employeeInformation = employeeInformation;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public EmployeeSalary( Long id,Date date, Long salary) {
		
		this.id=id;
		this.date = date;
		this.salary = salary;
	}

	public EmployeeSalary() {}

	@Override
	public String toString() {
		return "EmployeeSalary [id=" + id + ", date=" + date + ", salary=" + salary + "]";
	}

	
	
	
	
	
	
	
	
	
}
