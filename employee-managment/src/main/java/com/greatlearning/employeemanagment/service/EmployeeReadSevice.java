package com.greatlearning.employeemanagment.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.employeemanagment.entity.Employee;

public interface EmployeeReadSevice {

	List<Employee> GetAllEmployee();

	List<Employee> GetAllEmployeeInorder(Direction direction);

	List<Employee> GetAllEmployeeByName(String firstName);

	Employee getEmployeeById(Long id);

}