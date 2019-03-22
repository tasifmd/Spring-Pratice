package com.tasif.setterobjects2;

public class Car implements Vehicle {

	private String fuelType;
	private String maxSpeed;
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public void move() {
		System.out.println("Fuel type :" +fuelType);
		System.out.println("max speed :" +maxSpeed);
		System.out.println("car started....");

	}

}
