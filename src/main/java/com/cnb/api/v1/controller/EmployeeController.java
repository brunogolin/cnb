package com.cnb.api.v1.controller;

import com.cnb.api.v1.dto.EmployeeListDTO;
import com.cnb.api.v1.mapper.EmployeeMapper;
import com.cnb.model.Employee;
import com.cnb.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.cnb.api.v1.ApiResponseMessages.MESSAGE_200;
import static com.cnb.api.v1.ApiResponseMessages.MESSAGE_404;
import static com.cnb.api.v1.Path.BASE_PATH;

@RestController("EmployeeControllerV1")
@RequestMapping(BASE_PATH + "/employees")
@Api(produces = MediaType.APPLICATION_JSON_VALUE, tags = {"Employee"}, description = "Service of Employee")
public class EmployeeController extends BaseController {

	private final EmployeeService service;
	private final EmployeeMapper mapper;

	public EmployeeController(EmployeeService service, EmployeeMapper mapper) {
		this.service = service;
		this.mapper = mapper;
	}

	@GetMapping(value = "list")
	@ApiOperation("${abc}")
	@ApiResponses({
			@ApiResponse(code = 200, message = MESSAGE_200, response = Employee.class),
			@ApiResponse(code = 404, message = MESSAGE_404, response = ErrorResponse.class)
	})
	public ResponseEntity<EmployeeListDTO> getEmployees() {
		var emplyess = service.getAllEmployees();
		return buildSuccessResponse(mapper.toEmployeeListDTO(emplyess));
	}

	@RequestMapping(value = "/insertemployee", method = RequestMethod.POST)
	public void insertEmployee(@RequestBody Employee employee) {
		service.insertEmployee(employee);
	}

}
