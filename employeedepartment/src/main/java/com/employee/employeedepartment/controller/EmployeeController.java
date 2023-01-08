package com.employee.employeedepartment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeedepartment.dao.EmployeeDao;
import com.employee.employeedepartment.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao empDao;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return empDao.getAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id){
		return empDao.getEmployeeById(id);
	}
	
	
	@PostMapping("/employees")
	public String createEmployee(@RequestBody Employee employee){
		return empDao.createEmployee(employee) + " record inserted into employee department system";
	}
	
	
	@PutMapping("/employees/{id}")
	public String updateEmployee(@RequestBody Employee employee, @PathVariable int id){
		return empDao.updateEmployee(employee, id) + "record updated into employee department system";
	}

	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return empDao.deleteEmployee(id) + " record got deleted from empoyee department";
	}
}
