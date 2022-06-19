package com.morningstar.service;

import java.util.List;

import com.morningstar.dao.StudentDao;
import com.morningstar.model.Student;

public interface StudentService {
	
	public boolean addStudent(Student student);

	public Student findByStudentId(int studentId);
	
	public List<Student> findByAllStudent();

	public void setDao(StudentDao studentDao);
}
