package com.greatlearning.employeemanagment.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagment.entity.Employee;
import com.greatlearning.employeemanagment.repository.EmployeeRepository;
import com.greatlearning.employeemanagment.service.EmployeeUpdateService;

@Service
public class EmployeeUpdateServiceImpl implements EmployeeUpdateService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String updateemployee(long id, Employee employee) {
		Optional<Employee> emp = employeeRepository.findById(id);
		System.out.println("emp" + emp);
		if (emp.isPresent()) {
			emp.get().setEmail(employee.getEmail());
			emp.get().setFirstName(employee.getFirstName());
			emp.get().setLastName(employee.getLastName());
			employeeRepository.save(emp.get());
			return "updated sucessfully";
		}
		return "No employee with that id";
	}

}
