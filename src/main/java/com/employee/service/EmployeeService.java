package com.employee.service;

import com.employee.entity.EmployeeEntity;

public interface EmployeeService {

	EmployeeEntity saveNewEmployee(EmployeeEntity employee);

	void deleteEmployee(Long id);

	EmployeeEntity getEmployeeById(Long id);

}
