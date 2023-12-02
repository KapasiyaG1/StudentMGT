package com.kapasiya.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kapasiya.sms.repos.StudentRepo;

@SpringBootApplication
public class StudentMgtApplication implements CommandLineRunner
{
	public static void main(String[] args)
	{
		SpringApplication.run(StudentMgtApplication.class, args);
		
	}
	
	
	@Autowired
	private StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
//		Student student1 = new Student(1,"soyam kapasiya","dasthrath patel","6260461494","1051/A,Raj Nagar, Indore","04/12/2002","nothing");
//		studentRepo.save(student1);
//		
//		Student student2 = new Student(2,"vishal kapasiya","mahesh kapasiya","9926449856","226/A,Raj Nagar, Indore","04/04/2003","200 pending");
//		studentRepo.save(student2);
//		
//		Student student3 = new Student(3,"vishal kapasiya","mahesh kapasiya","9926449856","226/A,Raj Nagar, Indore","04/04/2003","200 pending");
//		studentRepo.save(student3);
	}

}