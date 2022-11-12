package com.greatlearning.employeemanagment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagment.entity.Employee;
import com.greatlearning.employeemanagment.repository.EmployeeRepository;
import com.greatlearning.employeemanagment.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return "Deleted employee id -"+id;
	}

}
