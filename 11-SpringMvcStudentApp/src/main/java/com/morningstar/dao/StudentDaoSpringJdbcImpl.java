package com.morningstar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.Student;

@Repository
public class StudentDaoSpringJdbcImpl implements StudentDao {

	@Autowired
	private JdbcTemplate template = null;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int createStudent(Student student) throws SQLException {
		String query = "Insert Into Student(Student_Id,Student_Name,Student_Score) values(?,?,?)";
		int result = template.update(query, student.getStudentId(), student.getStudentName(),
				student.getStudentScore());
		return result;
	}

	@Override
	public Student readStudent(int studentId) throws SQLException {
		String query = "Select * From Student Where Student_Id =" + studentId;
		Student result = template.queryForObject(query, new StudentRowMapper());

		return result;
	}

	@Override
	public List<Student> readAllStudents() throws SQLException {
		String query = "select * from student";
		List<Student> list = template.query(query, (ResultSet rs, int rowNum) -> {
			Student student = new Student();
			student.setStudentId(rs.getInt("student_id"));
			student.setStudentName(rs.getString("student_name"));
			student.setStudentScore(rs.getInt("student_score"));
			return student;
		});
		return list;
	}

}
