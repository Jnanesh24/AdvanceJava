package com.jsp.springautowiring.springjdbc;

import java.util.List;

public interface StudentDao 
{
	public int create(Student student);
	
	public int update(Student student);
	
	public int delete(int id);
	
	public Student read(int id);
	
	public List<Student> readAll();

	
	

}















