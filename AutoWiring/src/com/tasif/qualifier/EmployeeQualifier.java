package com.tasif.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeQualifier {
	private String name;
	private int id;
	@Autowired
	@Qualifier("address2")
	private AddressQualifier address;
	
	public AddressQualifier getAddress() {
		return address;
	}
	public void setAddress(AddressQualifier address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "EmployeeQualifier [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
}
	
