package com.tasif.collect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDetailClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeSalary.xml");
		EmployeeDetails employee = (EmployeeDetails)context.getBean("emplo") ;
		employee.display();
	}

}
