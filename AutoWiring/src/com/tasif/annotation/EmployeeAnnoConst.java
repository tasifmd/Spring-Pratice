package com.tasif.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeAnnoConst {
	private int id;
	private String name;
	private AddressAnnotation address;
	@Autowired
	public EmployeeAnnoConst(AddressAnnotation address) {
		super();
		this.address = address;
	}
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
		return "EmployeeAnnoConst [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
