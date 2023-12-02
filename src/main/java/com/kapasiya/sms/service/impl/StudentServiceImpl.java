package com.kapasiya.sms.service.impl;


import java.util.List;
import org.springframework.stereotype.Service;
import com.kapasiya.sms.entity.Student;
import com.kapasiya.sms.repos.StudentRepo;
import com.kapasiya.sms.services.StudentService;


@Service
public class StudentServiceImpl implements StudentService
{
	
	private StudentRepo studentRepo;
	
	

	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}



	@Override
	public List<Student> getAllStudents() 
	{
		return studentRepo.findAll();
	}



	@Override
	public Student saveStudent(Student student) 
	{
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}



	@Override
	public Student getStudentByRollNumber(Long roll_number) 
	{
		// TODO Auto-generated method stub
		return studentRepo.findById(roll_number).get();
	}



	@Override
	public Student updateStudent(Student student) 
	{
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}



	@Override
	public void deleteStudentById(Long roll_number) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(roll_number);
		
	}
}
