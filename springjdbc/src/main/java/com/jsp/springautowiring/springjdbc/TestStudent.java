package com.jsp.springautowiring.springjdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
        
	   ClassPathXmlApplicationContext context=null;
	   context =new ClassPathXmlApplicationContext("com/jsp/springautowiring/springjdbc/Springconfig.xml");
		 
	    Student student1= (Student) context.getBean("student1");
		Student student2= (Student) context.getBean("student2");
		Student student3= (Student) context.getBean("student3");
		Student student4= (Student) context.getBean("student4");   
		
		StudentDAOImpl studentDAOImpl= (StudentDAOImpl) context.getBean("studentDAOImpl");
        Student student=(Student)context.getBean("student1");
        int result1=studentDAOImpl.update(student);      
		
	/*	StudentDAOImpl studentDAOImpl=(StudentDAOImpl)context.getBean("studentDAOImpl");
        Student student2=(Student)context.getBean("student2");
        int res2=studentDAOImpl.delete(201);
		System.out.println("Number of records inserted are : "+res2);   
		
	/*	StudentDAOImpl studentDAOImpl=(StudentDAOImpl)context.getBean("studentDAOImpl");
		Student student=studentDAOImpl.read();
		System.out.println(student);   */
		 
	/*	StudentDAOImpl studentDAOImpl=(StudentDAOImpl)context.getBean("studentDAOImpl");
        List<Student> students=studentDAOImpl.readAll();
		for(Student students1 :students)
		{
			System.out.println(students1);   
		}                                       */
	    int res1=studentDAOImpl.create(student1);
		int res2=studentDAOImpl.create(student2);
        int res3=studentDAOImpl.create(student3);
        int res4=studentDAOImpl.create(student4);  
		
	    System.out.println("Number of records inserted are : "+res1);
		System.out.println("Number of records inserted are : "+res2);
		System.out.println("Number of records inserted are : "+res3);
		System.out.println("Number of records inserted are : "+res4);    
	
		
		if(context!=null)
		{
			context.close();
		}
				 
	}

}
