package com.tasif.collect;

import java.util.Iterator;
import java.util.List;

public class EmployeeDetails {
	private int id;
	private String name;
	List<Salary> salary;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(List<Salary> salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee id : " + id);
		System.out.println("Employee name : " + name);
		Iterator<Salary> it = salary.iterator();
		while(it.hasNext())
			System.out.print(it.next() + "\t");
		System.out.println();
	}
}
