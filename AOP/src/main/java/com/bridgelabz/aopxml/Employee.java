package com.bridgelabz.aopxml;

public class Employee {
	private int id;
	private String name;
	public Employee() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printDetails() {
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
