package com.tasif.setterobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextByRef.xml");  
          
        Employee emp=(Employee)context.getBean("obj");  
        emp.displayInfo();

	}

}
