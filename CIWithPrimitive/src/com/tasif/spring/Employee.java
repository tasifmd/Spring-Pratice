package com.tasif.spring;

public class Employee {
	private String name;
	private int id;
	private long mobileNo;
	

	public Employee(String name, long mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		System.out.println("Name : " + name + " Mobile : " + mobileNo);
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Name : " + name + " ID : " + id);
	}

	public Employee(String name, int id, long mobileNo) {
		super();
		this.name = name;
		this.id = id;
		this.mobileNo = mobileNo;
		System.out.println("Name : " + name + " Id : " + id + " Mobile : " + mobileNo);
	}
	
}
