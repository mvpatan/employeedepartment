package com.employee.employeedepartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.employee.employeedepartment"})
public class EmployeedepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedepartmentApplication.class, args);
	}

}
