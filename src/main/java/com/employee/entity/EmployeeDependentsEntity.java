package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EMPLOYEE_DEPENDENTS")
@Getter
@Setter
@NoArgsConstructor
public class EmployeeDependentsEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "DEPENDENT_ID")
	private Long dependentId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "RELATION")
	private String relation;
	
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")
	@ManyToOne
	private EmployeeEntity employeeEntity;
	
}
