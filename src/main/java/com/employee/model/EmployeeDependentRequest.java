package com.employee.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDependentRequest {
	private Long dependentId;

	private String name;

	private String relation;

	private String emailId;

	private Long employeeId;
}
