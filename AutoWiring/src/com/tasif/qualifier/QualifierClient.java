package com.tasif.qualifier;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("qualifierAnno.xml");
		EmployeeQualifier employee = (EmployeeQualifier) context.getBean("employee");
		System.out.println(employee);
	}

}
