package com.jsp.springautowiring.springjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDao
{
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int create(Student student) 
	{
		String sql=" Insert into Student "+" values(?,?)";
		int res=getJdbcTemplate().update(sql, student.getId(),student.getName());
		return res;
		
	}
	
	@Override
	public int update(Student student) {
		String sql=" update student "+" set name = ?"+ " where id = ?" ;
		int res=jdbcTemplate.update(sql, student.getId(),student.getName());
		return res;
	}
	
	@Override
	public int delete(int id) {
		String sql="delete from student"+" where id = ?";
		int res =jdbcTemplate.update(sql, id);
		return res;
	}
	
	
	StudentRowMapper rowMapper=new StudentRowMapper();


	@Override
	public Student read(int id) {
		
		String sql=" select * "+" from student "+" where id= ? ";
		
		Student student = jdbcTemplate.queryForObject(sql,rowMapper,id);
		
		return student;
	}


	public List<Student> readAll() 
	{
		
	String sql="select *"+"from student";
	StudentRowMapper rowMapper	=new StudentRowMapper();
	List<Student> students=jdbcTemplate.query(sql, rowMapper);
	
		return students;
	}

	

	

	
	
}
