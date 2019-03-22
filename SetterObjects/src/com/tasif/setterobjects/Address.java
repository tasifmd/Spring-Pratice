package com.tasif.setterobjects;

public class Address {
	private String addressLine,city,state,country;

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	} 
	
}
