package com.jspiders.springstandalonecollection;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context=null;
		context = new ClassPathXmlApplicationContext("com/jspiders/springstandalonecollection/Springconfig.xml");
		
		Student student=(Student) context.getBean("student");
		
		List<String> sub = student.getSubjects();
		System.out.println(sub.getClass());
		
		
		System.out.println(student);
		
		if(context !=null)
		{
			context.close();
		}
		

	}

}
