package com.employee.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DependentResponse {

	private Long employeeId;
	private Long dependentId;
	private String response;
	
}
