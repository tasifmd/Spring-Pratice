package com.tasif.objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("employeeAnnotation")
public class EmployeeAnnotation {
	@Value("100")
	private int id;
	@Value("Tasif")
	private String name;
	@Value("#{addressAnnotation}")
	private AddressAnnotation address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressAnnotation getAddress() {
		return address;
	}
	public void setAddress(AddressAnnotation address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeAnnotation [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
