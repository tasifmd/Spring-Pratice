package com.tasif.qualifier;

public class AddressQualifier {
	private String city;
	private String state;
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	@Override
	public String toString() {
		return "AddressQualifier [city=" + city + ", state=" + state + "]";
	}
}
