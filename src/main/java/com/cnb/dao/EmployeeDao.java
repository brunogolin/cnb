package com.cnb.dao;

import java.util.List;

import com.cnb.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();

	void insertEmployee(Employee employee);
}