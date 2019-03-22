package com.tasif.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeConstClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorAnno.xml");
		EmployeeAnnoConst emp = (EmployeeAnnoConst)context.getBean("employeeAnnoConst");
		System.out.println(emp);
	}

}
