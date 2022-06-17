package com.cnb.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.cnb.model.Employee;
import com.cnb.service.EmployeeService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/employees")
@Api(produces = MediaType.APPLICATION_JSON_VALUE, tags = {"Employee"}, description = "Service of Employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@GetMapping(value = "list")
	@Operation(summary = "Consultar pessoa")
	@ApiResponses({
			@ApiResponse(responseCode = "200", content =
			@Content(mediaType = APPLICATION_JSON_VALUE, schema =
			@Schema(implementation = Employee.class)))
	})
	public List<Employee> getEmployees() {
		return empService.getAllEmployees();
	}

	@RequestMapping(value = "/insertemployee", method = RequestMethod.POST)
	public void insertEmployee(@RequestBody Employee employee) {
		empService.insertEmployee(employee);
	}

}
