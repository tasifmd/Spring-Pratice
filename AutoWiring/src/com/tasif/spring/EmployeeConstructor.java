package com.tasif.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeConstructor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("comfigByConstructor.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);

	}

}
