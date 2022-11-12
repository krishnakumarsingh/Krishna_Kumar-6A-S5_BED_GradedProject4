package com.greatlearning.student.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.greatlearning.student.registration.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
