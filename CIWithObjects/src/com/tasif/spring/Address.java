package com.tasif.spring;

public class Address {
	private String City;
	private String State;
	public Address(String city, String state) {
		super();
		City = city;
		State = state;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + "]";
	}
	
}
