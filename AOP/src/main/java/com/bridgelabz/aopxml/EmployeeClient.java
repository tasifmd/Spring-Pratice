package com.bridgelabz.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlconfig.xml");
		Employee emp = (Employee) context.getBean("employee");
		emp.printDetails();
		((ClassPathXmlApplicationContext) context).close();
	}

}
