package com.greatlearning.employeemanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanagment.entity.Employee;
import com.greatlearning.employeemanagment.service.EmployeeCreateService;
import com.greatlearning.employeemanagment.service.EmployeeDeleteService;
import com.greatlearning.employeemanagment.service.EmployeeReadSevice;
import com.greatlearning.employeemanagment.service.EmployeeUpdateService;

@RestController
@RequestMapping("/employeeServices")
public class EmployeeController {

	@Autowired
	EmployeeReadSevice empReadService;
	@Autowired
	EmployeeCreateService createEmployee;
	@Autowired
	EmployeeDeleteService empDeleteService;

	@Autowired
	EmployeeUpdateService empUpdateService;

	@GetMapping("/allemplyee")
	public List<Employee> getAllEmployee() {
		return empReadService.GetAllEmployee();
	}

	@GetMapping("/getEmployeeById")
	public Employee getEmployeeById(Long id) {
		return empReadService.getEmployeeById(id);
	}

	@GetMapping("/getEmployeeByNames")
	public List<Employee> getEmployeeByNames(String name) {
		return empReadService.GetAllEmployeeByName(name);
	}

	@PostMapping("/employeeinfo")
	public String employeeDetails(@RequestBody Employee emp) {
		return createEmployee.addEmployee(emp);
	}

	@DeleteMapping("/deleteById")
	public String deleteEmplById(Long id) {
		return empDeleteService.deleteEmployee(id);
	}

	@GetMapping("/getEmployeesInsortedOrder")
	public List<Employee> getEmployeesInsortedOrder(Direction direction) {
		return empReadService.GetAllEmployeeInorder(direction);
	}

	@PutMapping("/employee/{id}")
	public String updateTutorial(@PathVariable("id") long id, @RequestBody Employee emp) {
		return empUpdateService.updateemployee(id, emp);
	}
}
