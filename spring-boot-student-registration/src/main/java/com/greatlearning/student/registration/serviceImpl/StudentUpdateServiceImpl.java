package com.greatlearning.student.registration.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.student.registration.entity.Student;
import com.greatlearning.student.registration.repository.StudentRepository;
import com.greatlearning.student.registration.service.StudentUpdateService;

@Service
public class StudentUpdateServiceImpl implements StudentUpdateService {

	@Autowired
	StudentRepository student;

	public String updateStudent(long id, Student std) {
		Optional<Student> studentData = student.findById(id);

		if (studentData.isPresent()) {
			studentData.get().setCountry(std.getCountry());
			studentData.get().setDepartment(std.getDepartment());
			studentData.get().setName(std.getName());
			student.save(studentData.get());
			return "updated sucessfully";
		}
		return "No employee with that id";
	}
}
