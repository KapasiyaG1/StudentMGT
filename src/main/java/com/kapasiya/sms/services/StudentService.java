package com.kapasiya.sms.services;

import java.util.List;

import com.kapasiya.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentByRollNumber(Long roll_number);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long roll_number);
}
