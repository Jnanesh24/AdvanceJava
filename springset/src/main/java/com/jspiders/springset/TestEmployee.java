package com.jspiders.springset;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee
{

	public static void main(String[] args)
	{
		
		ClassPathXmlApplicationContext context  =null;
		 context =  new ClassPathXmlApplicationContext("com/jspiders/springset/springconfi.xml");
		 
		 Employee emp=(Employee) context.getBean("employee");
				 System.out.println(emp);
				
			Set<Long> contact	= emp.getContact();
			System.out.println(contact.getClass());
				 
				 if(context !=null)
				 {
					 context.close();
				 }
		 
		
	}

}
