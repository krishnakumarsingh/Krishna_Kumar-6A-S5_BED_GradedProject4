package com.greatlearning.student.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.student.registration.entity.Student;
import com.greatlearning.student.registration.service.StudentCreateService;
import com.greatlearning.student.registration.service.StudentDeleteService;
import com.greatlearning.student.registration.service.StudentReadService;
import com.greatlearning.student.registration.service.StudentUpdateService;

@RestController
@RequestMapping("/studentService")
public class StudentController {
	@Autowired
	StudentCreateService createStudent;

	@Autowired
	StudentUpdateService updateStudentserv;

	@Autowired
	StudentDeleteService studentDeleteServ;

	@Autowired
	StudentReadService studentReadService;

	@PostMapping("/createStudent")
	public String AddStudent(@RequestBody Student student) {
		return createStudent.addStudent(student);
	}

	@PutMapping("/updateStudent/{id}")
	public String updateStudentById(@PathVariable("id") long id, @RequestBody Student std) {
		return updateStudentserv.updateStudent(id, std);

	}

	@DeleteMapping("/deleteById")
	public String deleteStudentById(Long id) {
		return studentDeleteServ.deleteStudentById(id);
	}

	@GetMapping("/getAllStudent")

	public List<Student> getAllStudents() {
		return studentReadService.GetAllEmployee();
	}

}
