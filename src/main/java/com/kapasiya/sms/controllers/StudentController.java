package com.kapasiya.sms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kapasiya.sms.entity.Student;
import com.kapasiya.sms.services.StudentService;


@Controller
public class StudentController 
{
	private StudentService studentService;

	public StudentController(StudentService studentService) 
	{
		super();
		this.studentService = studentService;
	}
	
	// Handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudent(Model model)
	{
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model)
	{
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{roll_number}")
	public String editStudentForm(@PathVariable Long roll_number,Model model)
	{
		model.addAttribute("student",studentService.getStudentByRollNumber(roll_number));
		return "edit_student";
	}
	
	@GetMapping("/students/{roll_number}")
	public String deleteStudent(@PathVariable Long roll_number) {
		studentService.deleteStudentById(roll_number);
		return "redirect:/students";
	}
	
	@PostMapping("/students/{roll_number}")
	public String updateStudent(@PathVariable Long roll_number,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentByRollNumber(roll_number);
		existingStudent.setRoll_number(roll_number);
		existingStudent.setStudent_name(student.getStudent_name());
		existingStudent.setFather_name(student.getFather_name());
		existingStudent.setPhone_number(student.getPhone_number());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setJoining_date(student.getJoining_date());
		existingStudent.setRemark(student.getRemark());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";		
	}
}
     