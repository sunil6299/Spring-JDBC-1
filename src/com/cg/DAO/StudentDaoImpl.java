package com.cg.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.api.Student;
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {
		
		
		String str = "insert into student values(?,?,?)";
		Object[] arg = {student.getRollNum(),student.getStudentName(),student.getStudentAdd()};
		
		int rowcount = jdbcTemplate.update(str, arg);
		System.out.println("rows inserted" + rowcount);

	}
	
	/*
	 * public DataSource getDataSource() {
	 * 
	 * String url = "jdbc:mysql://localhost:3306/school"; String uname = "root";
	 * String pswd = "sunil"; DataSource datasource = new
	 * DriverManagerDataSource(url, uname, pswd);
	 * 
	 * return datasource; }   // java way now we are doing in xml way
	 */

}
