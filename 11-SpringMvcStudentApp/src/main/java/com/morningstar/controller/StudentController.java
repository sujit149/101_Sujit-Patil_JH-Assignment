package com.morningstar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.morningstar.model.Student;
import com.morningstar.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping(path="/")
	public String hello() {
		return "index";
	}

	@GetMapping(path="addStudentForm.view")
	public String showstudentForm() {
		
		return "addStudent";
		
	}
	
	@PostMapping(path="addStudent.do")
	public String addStudent(Student student) {
		boolean result=service.addStudent(student);
		
		if(result) {
		return "redirect:viewStudent.do";
		}
		else
			return "error";
	}
		/*@GetMapping(path = "viewStudent.do")
		
		public String getAllStudents(Model model) {
			List<Student> students = service.findByAllStudent();
			model.addAttribute("studentList", students);
			return "viewStudent";
		}*/
		@GetMapping(path = "viewStudent.do")
		public String getAllStudents(Model model) {
			List<Student> students = service.findByAllStudent();
			model.addAttribute("studentList", students);
			return "viewStudent";
		}

	}

