package com.tasif.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");  
        
        Employee employee = (Employee)context.getBean("emp");  
        employee.getEmployeeList();
        employee.getEmployeeMap();
        employee.getEmployeeSet();

	}

}
