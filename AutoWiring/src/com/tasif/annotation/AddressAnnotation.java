package com.tasif.annotation;

public class AddressAnnotation {
	private String city;
	private String state;
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressByName [city=" + city + ", state=" + state + "]";
	}
}
