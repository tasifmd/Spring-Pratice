package com.tasif.setterobjects;

public class Employee {
	private int id;  
	private String name;  
	private Address address;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}  
}
