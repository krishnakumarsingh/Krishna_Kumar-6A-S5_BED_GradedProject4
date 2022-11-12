package com.greatlearning.student.registration.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.student.registration.repository.StudentRepository;
import com.greatlearning.student.registration.service.StudentDeleteService;

@Service
public class StudentDeleteServiceImpl implements StudentDeleteService {

	@Autowired
	StudentRepository student;

	public String deleteStudentById(Long id) {
		student.deleteById(id);
		return "deleted sucessfully";
	}
}
