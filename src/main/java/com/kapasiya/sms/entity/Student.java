package com.kapasiya.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student 
{
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long roll_number;

	
	@Column(name ="student_name", nullable = false)
	private String student_name;
	
	@Column(name ="father_name")
	private String father_name;
	
	@Column(name ="phone_number", nullable = false) 
	private String phone_number;
	
	@Column(name ="address")
	private String address;
	
	@Column(name ="joining_date")
	private String joining_date;
	
	@Column(name ="remark")
	private String remark;
	

	
	public Long getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(Long roll_number) {
		this.roll_number = roll_number;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Student(Long roll_number, String student_name, String father_name, String phone_number, String address,
			String joining_date, String remark) {
		super();
		this.roll_number = roll_number;
		this.student_name = student_name;
		this.father_name = father_name;
		this.phone_number = phone_number;
		this.address = address;
		this.joining_date = joining_date;
		this.remark = remark;
	}

	// Default constructure 
	public Student() {
		
	}
		
}
