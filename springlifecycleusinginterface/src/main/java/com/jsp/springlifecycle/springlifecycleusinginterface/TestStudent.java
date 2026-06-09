package com.jsp.springlifecycle.springlifecycleusinginterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=null;
		
		context =new ClassPathXmlApplicationContext("com/jsp/springlifecycle/springlifecycleusinginterface/springconfig.xml");
		
		Student std=(Student)context.getBean("student");
		System.out.println(std);
		
		if(context!=null)
		{
			context.close();
		}

	}

}
