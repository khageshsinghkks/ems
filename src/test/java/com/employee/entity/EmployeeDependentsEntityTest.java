/**
 * 
 */
package com.employee.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author khagesh
 *
 */
@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
class EmployeeDependentsEntityTest {
	
	@InjectMocks
	private EmployeeDependentsEntity entity;

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#getDependentId()}.
	 */
	@Test
	void testGetDependentId() {
		entity.setDependentId(1L);
		assertEquals(1L, entity.getDependentId());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#getName()}.
	 */
	@Test
	void testGetName() {
		entity.setName("test");
		assertEquals("test", entity.getName());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#getRelation()}.
	 */
	@Test
	void testGetRelation() {
		entity.setRelation("test");
		assertEquals("test", entity.getRelation());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#getEmailId()}.
	 */
	@Test
	void testGetEmailId() {
		entity.setEmailId("test@yopmail.com");
		assertEquals("test@yopmail.com", entity.getEmailId());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#getEmployeeEntity()}.
	 */
	@Test
	void testGetEmployeeEntity() {
		entity.setEmployeeEntity(new EmployeeEntity());
		assertEquals(null, entity.getEmployeeEntity().getEmployeeId());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#setDependentId(Long)}.
	 */
	@Test
	void testSetDependentId() {
		entity.setDependentId(1L);
		assertEquals(1L, entity.getDependentId());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#setName(String)}.
	 */
	@Test
	void testSetName() {
		entity.setName("test");
		assertEquals("test", entity.getName());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#setRelation(String)}.
	 */
	@Test
	void testSetRelation() {
		entity.setRelation("test");
		assertEquals("test", entity.getRelation());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#setEmailId(String)}.
	 */
	@Test
	void testSetEmailId() {
		entity.setEmailId("test@yopmail.com");
		assertEquals("test@yopmail.com", entity.getEmailId());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#setEmployeeEntity(EmployeeEntity)}.
	 */
	@Test
	void testSetEmployeeEntity() {
		entity.setEmployeeEntity(new EmployeeEntity());
		assertEquals(null, entity.getEmployeeEntity().getEmployeeId());
	}

	/**
	 * Test method for {@link com.employee.entity.EmployeeDependentsEntity#EmployeeDependentsEntity()}.
	 */
	@Test
	void testEmployeeDependentsEntity() {
		assertNotNull(entity);
	}

}
