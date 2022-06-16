package com.cnb.service;

import java.util.List;

import com.cnb.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}