package com.jspiders.springcollection;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context =null;
		
		context= new ClassPathXmlApplicationContext("com/jspiders/springcollection/Springconfig.xml");
		
		Country country=(Country) context.getBean("country");
		System.out.println(country);
		
		Map<String, String> stateandlanguages=country.getStateandlanguages();
		System.out.println(stateandlanguages.getClass());
		
		if(context !=null)
		{
			context.close();
		}

	}

}
