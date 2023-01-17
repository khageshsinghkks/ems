package com.employee.service;

import com.employee.entity.EmployeeDependentsEntity;
import com.employee.model.EmployeeDependentRequest;

public interface DependentService {

	EmployeeDependentsEntity saveNewDependent(EmployeeDependentRequest dependent);

}
