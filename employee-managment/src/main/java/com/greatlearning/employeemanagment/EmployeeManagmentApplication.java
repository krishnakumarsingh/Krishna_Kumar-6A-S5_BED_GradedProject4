package com.greatlearning.employeemanagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.employeemanagment.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagmentApplication {

	
	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentApplication.class, args);
	}

}
