package com.greatlearning.employeemanagment.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagment.entity.Employee;
import com.greatlearning.employeemanagment.repository.EmployeeRepository;
import com.greatlearning.employeemanagment.service.EmployeeReadSevice;

@Service
public class EmployeeReadServiceImpl implements EmployeeReadSevice {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> GetAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> GetAllEmployeeInorder(Direction direction) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll(Sort.by(direction, "firstName"));
	}

	@Override
	public List<Employee> GetAllEmployeeByName(String firstName) {
		Employee emp = new Employee();
		emp.setFirstName(firstName);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("firstName", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "lastName", "email");

		Example exp = Example.of(emp, exampleMatcher);

		return employeeRepository.findAll(exp);
	}

}
