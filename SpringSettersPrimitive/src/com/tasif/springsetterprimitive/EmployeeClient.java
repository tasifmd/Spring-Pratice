package com.tasif.springsetterprimitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); 
        Empoyee e=(Empoyee)context.getBean("obj");  
        e.display();  
	}

}
