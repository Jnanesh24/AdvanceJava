package com.jspiders.springdependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=null;
		
          context= new  ClassPathXmlApplicationContext("com/jspiders/springdependencyinjection/springconfig.xml");
          
          College college=(College) context.getBean("college");
          System.out.println(college);
          if(context!=null)
        	  context.close();
	}

}
