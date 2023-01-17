/**
 * 
 */
/*
 * package com.employee.controller;
 * 
 * import static org.junit.jupiter.api.Assertions.*; import static
 * org.mockito.Mockito.doNothing; import static org.mockito.Mockito.doThrow;
 * import static org.mockito.Mockito.when;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.junit.jupiter.api.extension.ExtendWith; import org.junit.runner.RunWith;
 * import org.mockito.InjectMocks; import org.mockito.Mock; import
 * org.mockito.Mockito; import org.mockito.junit.MockitoJUnitRunner; import
 * org.mockito.junit.jupiter.MockitoExtension; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 * 
 * import com.employee.entity.EmployeeEntity; import
 * com.employee.model.EmployeeResponse; import
 * com.employee.service.EmployeeService;
 * 
 *//**
	 * @author khagesh
	 *
	 */
/*
 * 
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ExtendWith(MockitoExtension.class) public class EmployeeControllerTest {
 * 
 * @InjectMocks private EmployeeController employeeController;
 * 
 * @Mock private EmployeeService employeeService;
 * 
 * static EmployeeEntity getEmployeeEntity() { EmployeeEntity employeeEntity =
 * new EmployeeEntity(); employeeEntity.setEmailId("test@yopmail.com");
 * employeeEntity.setEmployeeId(1L);
 * employeeEntity.setFirstName("testFirstName");
 * employeeEntity.setLastName("testLastName"); return employeeEntity; }
 * 
 *//**
	 * Test method for
	 * {@link com.employee.controller.EmployeeController#addEmployee(com.employee.entity.EmployeeEntity)}.
	 */
/*
 * @Test public void testAddEmployee() {
 * when(employeeService.saveNewEmployee(Mockito.any(EmployeeEntity.class))).
 * thenReturn(getEmployeeEntity()); ResponseEntity<EmployeeResponse>
 * responseEntity = employeeController.addEmployee(getEmployeeEntity());
 * assertEquals(200, responseEntity.getStatusCodeValue()); assertEquals(1L,
 * responseEntity.getBody().getEmployeeId());
 * when(employeeService.saveNewEmployee(Mockito.any(EmployeeEntity.class))).
 * thenThrow(new NullPointerException("Custom Exception"));
 * ResponseEntity<EmployeeResponse> responseEntityFailed =
 * employeeController.addEmployee(getEmployeeEntity()); assertEquals(400,
 * responseEntityFailed.getStatusCodeValue()); assertEquals(null,
 * responseEntityFailed.getBody().getEmployeeId()); }
 * 
 *//**
	 * Test method for
	 * {@link com.employee.controller.EmployeeController#deleteEmployee(java.lang.Long)}.
	 */
/*
 * @Test public void testDeleteEmployee() {
 * doNothing().when(employeeService).deleteEmployee(Mockito.anyLong());
 * ResponseEntity<EmployeeResponse> responseEntity =
 * employeeController.deleteEmployee(1L); assertEquals(200,
 * responseEntity.getStatusCodeValue()); assertEquals(1L,
 * responseEntity.getBody().getEmployeeId()); doThrow(new
 * NullPointerException("Custom Exception")).when(employeeService).
 * deleteEmployee(Mockito.anyLong()); ResponseEntity<EmployeeResponse>
 * responseEntityFailed = employeeController.deleteEmployee(1L);
 * assertEquals(400, responseEntityFailed.getStatusCodeValue());
 * assertEquals("could not delete employee",
 * responseEntityFailed.getBody().getResponse()); }
 * 
 *//**
	 * Test method for
	 * {@link com.employee.controller.EmployeeController#getEmployee(java.lang.Long)}.
	 *//*
		 * @Test public void testGetEmployee() {
		 * when(employeeService.getEmployeeById(Mockito.anyLong())).thenReturn(
		 * getEmployeeEntity()); ResponseEntity<EmployeeEntity> responseEntity =
		 * employeeController.getEmployee(1L); assertEquals(200,
		 * responseEntity.getStatusCodeValue()); assertEquals(1L,
		 * responseEntity.getBody().getEmployeeId());
		 * when(employeeService.getEmployeeById(Mockito.anyLong())).thenThrow(new
		 * NullPointerException("Custom Exception")); ResponseEntity<EmployeeEntity>
		 * responseEntityFailed = employeeController.getEmployee(1L); assertEquals(400,
		 * responseEntityFailed.getStatusCodeValue());
		 * assertNull(responseEntityFailed.getBody()); }
		 * 
		 * }
		 */