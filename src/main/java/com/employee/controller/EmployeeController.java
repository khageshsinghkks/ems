package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.EmployeeEntity;
import com.employee.model.EmployeeResponse;
import com.employee.service.EmployeeService;
import static com.employee.util.Constants.EMPLOYEE_SAVE_FAILURE;
import static com.employee.util.Constants.EMPLOYEE_SAVED_SUCCESS;
import static com.employee.util.Constants.EMPLOYEE_DELETE_FAILURE;
import static com.employee.util.Constants.EMPLOYEE_DELETED_SUCCESS;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("employee/")
@Slf4j
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<EmployeeResponse> addEmployee(@RequestBody EmployeeEntity employee){
		log.info("request received to add new employee");
		EmployeeResponse employeeResponse = new EmployeeResponse();
		HttpStatus httpStatus;
		try {
			EmployeeEntity employeeEntity = employeeService.saveNewEmployee(employee);
			log.info("New employee saved with employee id : {}", employeeEntity.getEmployeeId());
			employeeResponse.setResponse(EMPLOYEE_SAVED_SUCCESS);
			employeeResponse.setEmployeeId(employeeEntity.getEmployeeId());
			httpStatus = HttpStatus.OK;
		} catch (Exception e) {
			log.error("An error occured while saving new employee", e);
			employeeResponse.setResponse(EMPLOYEE_SAVE_FAILURE);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<>(employeeResponse, httpStatus);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<EmployeeResponse> deleteEmployee(@PathVariable("id") Long id){
		log.info("Request treceived to delete employee with id : {}", id);
		EmployeeResponse employeeResponse = new EmployeeResponse();
		HttpStatus httpStatus;
		try {
			employeeService.deleteEmployee(id);
			log.info("Employee with id {} has been deleted", id);
			employeeResponse.setResponse(EMPLOYEE_DELETED_SUCCESS);
			employeeResponse.setEmployeeId(id);
			httpStatus = HttpStatus.OK;
		}catch(Exception e) {
			log.error("An error occured while deleting the employee with id : {}", id);
			employeeResponse.setResponse(EMPLOYEE_DELETE_FAILURE);
			employeeResponse.setEmployeeId(id);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<>(employeeResponse, httpStatus);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<EmployeeEntity> getEmployee(@PathVariable("id") Long id){
		log.info("request received to fetch details for the employee with id {}", id);
		HttpStatus httpStatus;
		EmployeeEntity employeeEntity = null;
		try {
			employeeEntity = employeeService.getEmployeeById(id);
			httpStatus = HttpStatus.OK;
		}catch(Exception e) {
			log.error("An error occured while fetching the details for employee with id {}", id);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<>(employeeEntity, httpStatus);
	}

}
