package com.employee.employeedepartment.dao;

import java.util.List;

import com.employee.employeedepartment.model.Employee;

public interface EmployeeDao {

	int createEmployee(Employee employee);
	
	int updateEmployee(Employee employee, int id);
	
	int deleteEmployee(int id);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(int id);
}
