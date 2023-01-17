/**
 * 
 */
package com.employee.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.employee.entity.EmployeeDependentsEntity;
import com.employee.entity.EmployeeEntity;
import com.employee.model.DependentResponse;
import com.employee.model.EmployeeDependentRequest;
import com.employee.service.DependentService;

/**
 * @author khagesh
 *
 */
@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class DependentControllerTest {

	@InjectMocks
	private DependentController dependentController;
	
	@Mock
	private DependentService dependentService;
	
	static EmployeeDependentsEntity getEmployeeDependentsEntity() {
		EmployeeDependentsEntity employeeDependentsEntity = new EmployeeDependentsEntity();
		employeeDependentsEntity.setDependentId(1L);
		employeeDependentsEntity.setEmailId("test@yopmail.com");
		employeeDependentsEntity.setEmployeeEntity(new EmployeeEntity());
		employeeDependentsEntity.setName("testName");
		employeeDependentsEntity.setRelation("testRelation");
		return employeeDependentsEntity;
	}
	
	static EmployeeDependentRequest getEmployeeDependentRequest() {
		EmployeeDependentRequest employeeDependentRequest = new EmployeeDependentRequest();
		employeeDependentRequest.setDependentId(1L);
		employeeDependentRequest.setEmailId("test@yopmail.com");
		employeeDependentRequest.setEmployeeId(1L);
		employeeDependentRequest.setName("testname");
		employeeDependentRequest.setRelation("testRelation");
		return employeeDependentRequest;
	}
	
	@Test
	void addDependent() {
		when(dependentService.saveNewDependent(Mockito.any(EmployeeDependentRequest.class))).thenReturn(getEmployeeDependentsEntity());
		ResponseEntity<DependentResponse> responseEntity = dependentController.addDependent(getEmployeeDependentRequest());
		assertEquals(200, responseEntity.getStatusCodeValue());
		assertEquals(1L, responseEntity.getBody().getDependentId());
	}
	
	@Test
	void addDependentException() {
		when(dependentService.saveNewDependent(Mockito.any(EmployeeDependentRequest.class))).thenThrow(new NullPointerException("Custom Exception"));
		ResponseEntity<DependentResponse> responseEntity = dependentController.addDependent(getEmployeeDependentRequest());
		assertEquals(400, responseEntity.getStatusCodeValue());
		assertEquals("could not save dependent", responseEntity.getBody().getResponse());
	}

}
