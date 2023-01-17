package com.employee.controller;

import static com.employee.util.Constants.DEPENDENT_SAVED_SUCCESS;
import static com.employee.util.Constants.DEPENDENT_SAVE_FAILURE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.EmployeeDependentsEntity;
import com.employee.model.DependentResponse;
import com.employee.model.EmployeeDependentRequest;
import com.employee.service.DependentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("dependent/")
@Slf4j
public class DependentController {

	@Autowired
	DependentService dependentService;
	
	@PostMapping
	public ResponseEntity<DependentResponse> addDependent(@RequestBody EmployeeDependentRequest dependent){
		log.info("request received to add new employee");
		DependentResponse dependentResponse = new DependentResponse();
		HttpStatus httpStatus;
		try {
			EmployeeDependentsEntity EmployeeDependentsEntity = dependentService.saveNewDependent(dependent);
			log.info("New dependent with id {} addded to employee with employee id : {}", dependentResponse.getDependentId(), dependentResponse.getEmployeeId());
			dependentResponse.setResponse(DEPENDENT_SAVED_SUCCESS);
			dependentResponse.setEmployeeId(EmployeeDependentsEntity.getDependentId());
			dependentResponse.setDependentId(EmployeeDependentsEntity.getDependentId());
			httpStatus = HttpStatus.OK;
		} catch (Exception e) {
			log.error("An error occured while saving new dependent", e);
			dependentResponse.setResponse(DEPENDENT_SAVE_FAILURE);
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<>(dependentResponse, httpStatus);
	}
	
}
