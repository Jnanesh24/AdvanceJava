package com.jsp.springautowiring.springautoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Student Student) {
		String sql="insert into student"+" values(?,?)";
		
		return 0;
		
	}
	

}
