package com.morningstar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.morningstar.model.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
	student.setStudentId(rs.getInt("Student_Id"));
	student.setStudentName(rs.getString("Student_Name"));
	student.setStudentScore(rs.getInt("Student_Score"));
		return student;
	}

}
