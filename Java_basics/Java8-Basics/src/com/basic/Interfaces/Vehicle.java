package com.basic.Interfaces;

public class Vehicle {

	public static void main(String[] args) {
		
		Drivable d1= new Car();
		Drivable d2= new Bike();
		Drivable d3= new Truck();

	}
}

class Car implements Drivable{
	@Override
	public void driven() {
		System.out.println("The car can be driven");
	}
}

class Bike implements Drivable{
	@Override
	public void driven() {
		System.out.println("The bike can be driven");
	}
}

class Truck implements Drivable{
	@Override
	public void driven() {
		System.out.println("The truck can be driven");
	}
}
