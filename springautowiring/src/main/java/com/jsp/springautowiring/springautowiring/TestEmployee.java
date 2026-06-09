package com.jsp.springautowiring.springautowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
        
		
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("com/jsp/springautowiring/springautowiring/Springconfig.xml");
		
		
		Employee emp=(Employee)context.getBean("employee");
		System.out.println(emp);
		
		if(context !=null)
		{
			context.close();
		}
	}

}
