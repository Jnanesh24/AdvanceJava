package com.jspiders.springreferanceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=null;
	context	=new ClassPathXmlApplicationContext("com/jspiders/springreferanceinjection/springconfig.xml");
	
	Person person=(Person) context.getBean("person");
			System.out.println(person);
			
			if(context !=null)
			{                                                                             
				context.close();
			}                                                                                         /* ref as element
			
																									 <bean name="person" class="com.jspiders.springreferanceinjection.Person"
																						   p:name="king" p:email="king@gmail.com" p:contact="9663520403" p:address-ref="address"/>																						 <property name="name" value="Anand"/>
																						 <property name="email" value="Anand@gmail.com"/>
																						 <property name="contact" value="7829777077"/>
																						 
		                                                                                         	<property name="address			                                                                                       <ref bean="address"/>*/
	}

}
