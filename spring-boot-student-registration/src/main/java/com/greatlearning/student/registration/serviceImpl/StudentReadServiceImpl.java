package com.greatlearning.student.registration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.student.registration.entity.Student;
import com.greatlearning.student.registration.repository.StudentRepository;
import com.greatlearning.student.registration.service.StudentReadService;

@Service
public class StudentReadServiceImpl implements StudentReadService {

	@Autowired
	StudentRepository studentRepo;

	@Override
	public List<Student> GetAllEmployee() {
		return studentRepo.findAll();
	}
}
