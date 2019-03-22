package com.tasif.springsetterprimitive;

public class Empoyee {
	private int id;  
	private String name;  
	private String city;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void display(){  
	    System.out.println(id+" "+name+" "+city);  
	} 
}
