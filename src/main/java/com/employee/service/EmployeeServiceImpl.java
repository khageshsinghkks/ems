package com.employee.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.EmployeeEntity;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public EmployeeEntity saveNewEmployee(EmployeeEntity employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	@Transactional
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public EmployeeEntity getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

}
