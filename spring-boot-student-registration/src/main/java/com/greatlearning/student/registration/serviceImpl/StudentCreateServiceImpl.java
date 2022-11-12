package com.greatlearning.student.registration.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.student.registration.entity.Student;
import com.greatlearning.student.registration.repository.StudentRepository;
import com.greatlearning.student.registration.service.StudentCreateService;

@Service
public class StudentCreateServiceImpl implements StudentCreateService {

	@Autowired
	StudentRepository student;

	public String addStudent(Student std) {
		student.saveAndFlush(std);
		return "student detail saved";

	}
}
