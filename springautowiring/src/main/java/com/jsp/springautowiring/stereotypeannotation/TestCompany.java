package com.jsp.springautowiring.stereotypeannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCompany {

	public static void main(String[] args) {
        
		
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("com/jsp/springautowiring/stereotypeannotation/Springconfig.xml");
		
		
		Company comp=(Company)context.getBean("comp");
		System.out.println(comp);
		
		if(context !=null)
		{
			context.close();
		}
	}
}

