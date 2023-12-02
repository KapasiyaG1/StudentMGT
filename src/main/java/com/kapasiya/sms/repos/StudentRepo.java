package com.kapasiya.sms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kapasiya.sms.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>
{
	
}