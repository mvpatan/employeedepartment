package com.employee.employeedepartment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String city;
	
	//private Integer deptId;
	
	//private String deptName;
	
	

}
