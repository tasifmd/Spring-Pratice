package com.bridgelabz.aopannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annoconfig.xml");
		Employee emp = (Employee) context.getBean("employee");
		emp.printDetails();
		((ClassPathXmlApplicationContext) context).close();
	}

}
