package com.jspiders.springconstructorinjuction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddition {

	public static void main(String[] args) 
	{
		
		
		ClassPathXmlApplicationContext context=null;
		context =new ClassPathXmlApplicationContext("com/jspiders/springconstructorinjuction/Springconfig.xml");
		
		Addition addition =(Addition) context.getBean("addition");
		 
         System.out.println(addition);
         if(context!=null)
       	  context.close();
	}
			

}
