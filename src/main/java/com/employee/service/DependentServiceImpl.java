package com.employee.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.EmployeeDependentsEntity;
import com.employee.model.EmployeeDependentRequest;
import com.employee.repository.DependentsRepository;

@Service
public class DependentServiceImpl implements DependentService {
	
	@Autowired
	private DependentsRepository dependentsRepository;
	
	@Autowired
	private EmployeeService employeeService;

	@Override
	@Transactional
	public EmployeeDependentsEntity saveNewDependent(EmployeeDependentRequest dependent) {
		EmployeeDependentsEntity employeeDependentsEntity = new EmployeeDependentsEntity();
		employeeDependentsEntity.setEmailId(dependent.getEmailId());
		employeeDependentsEntity.setName(dependent.getName());
		employeeDependentsEntity.setRelation(dependent.getRelation());
		employeeDependentsEntity.setEmployeeEntity(employeeService.getEmployeeById(dependent.getEmployeeId()));
		return dependentsRepository.save(employeeDependentsEntity);
	}

}
