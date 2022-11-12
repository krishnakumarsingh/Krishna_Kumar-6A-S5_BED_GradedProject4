package com.greatlearning.employeemanagment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagment.entity.Employee;
import com.greatlearning.employeemanagment.repository.EmployeeRepository;
import com.greatlearning.employeemanagment.service.EmployeeCreateService;

@Service
public class EmployeeCreateServiceImpl implements EmployeeCreateService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(Employee emp) {
		employeeRepository.saveAndFlush(emp);
		return "employee detail saved";

	}

}
