package com.tasif.withouttype;

public class Employee {
	private String name;
    private int age;
    private String country;
	public Employee(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
}
