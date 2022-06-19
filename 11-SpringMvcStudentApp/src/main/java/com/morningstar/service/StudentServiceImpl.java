package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningstar.dao.StudentDao;
//import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

//	private StudentDao dao = new StudentDaoImpl();	// this make code untestable bcaz we cant create mock object

	@Autowired
	private StudentDao dao = null;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addStudent(Student student) {
		try {
			int result = dao.createStudent(student);
			if (result >= 1) {
				//StudentDaoImpl.getConnection().commit();
				return true;
			}
		} catch (SQLException e) {

			//try {
				//StudentDaoImpl.getConnection().rollback();
			//} //catch (SQLException e1) {
				//e1.printStackTrace();
			//}

		//	e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student findByStudentId(int studentId) {

		Student student = null;

		try {
			student = dao.readStudent(studentId);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}
	
	public List<Student> findByAllStudent(){
		try {
			return dao.readAllStudents();
		} catch (SQLException e) {
			System.out.println("");
//			e.printStackTrace();
		}
		return null;
	}

}
