package com.tasif.objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressAnnotation")
public class AddressAnnotation {
	@Value("Mumbai")
	private String city;
	@Value("Maharastra")
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressAnnotation [city=" + city + ", state=" + state + "]";
	}
	
}
