package com.tasif.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeePrimiveClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("primitiveConfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
