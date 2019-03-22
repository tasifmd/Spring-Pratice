package com.tasif.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeAnnotation {
	private int id;
	private String name;
	@Autowired
	private AddressAnnotation address;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(AddressAnnotation address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeAnnotation [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
