package com.employee.employeedepartment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employee.employeedepartment.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createEmployee(Employee employee) {
		
		return jdbcTemplate.update("INSERT INTO employees (name, email, city) VALUES (?,?,?)", new Object[] {employee.getName(), employee.getEmail(), employee.getCity()});
	}

	@Override
	public int updateEmployee(Employee employee, int id) {
		
		return jdbcTemplate.update("UPDATE employees SET name=?, email=?, city=? where id=?", new Object[] {employee.getName(), employee.getEmail(), employee.getCity()}, id); 
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query("SELECT * FROM employees", new BeanPropertyRowMapper<Employee>(Employee.class));
		
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return jdbcTemplate.queryForObject("SELECT * FROM employees where id=?", new BeanPropertyRowMapper<Employee>(Employee.class), id);
	}

}
