package com.tasif.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAnnoClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configByType.xml");
		EmployeeAnnotation emp = (EmployeeAnnotation) context.getBean("employeeAnnotation");
		System.out.println(emp);
	}

}
