package com.tasif.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAnnoClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("objectConfig.xml");
		EmployeeAnnotation employee = (EmployeeAnnotation) context.getBean("employeeAnnotation");
		System.out.println(employee);
	}

}
