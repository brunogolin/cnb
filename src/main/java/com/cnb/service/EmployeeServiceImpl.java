package com.cnb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnb.dao.EmployeeDao;
import com.cnb.model.Employee;
import com.cnb.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		return employees;
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
		
	}

}