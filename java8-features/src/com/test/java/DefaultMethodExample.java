package com.test.java;
 interface Vehicle
{
	
	String getBrand();
	String speedUp();
	String slowDown();
	
	default String applyBreak()
	{
		return "Break applied!! \n Vehicle stopped.";
	}
	
	default String turnSideIndicatorOn()
	{
		return "Turning the vehicle side indicator on";
	}
	
	default String turnSideIndicatorOff()
	{
		return "Turning the vehicle side indicator off";
	}
	
	
	
	static int getHorsePower(int rpm, int torque)
	{
		return (rpm * torque)/5252;
	}
	
}

 class Car implements Vehicle
{
	
	private final String brand;

	public Car(String brand)
	{
		this.brand=brand;
	}
	
	@Override
	public String getBrand() {
		
		return this.brand;
	}

	@Override
	public String speedUp() {
		
		return "This car is speeding up!";
	}

	@Override
	public String slowDown() {
	
		return "This car is slowing down!";
	}
	
}
 
 
 
 class Bike implements Vehicle
{
	
	private final String brand;
	
	public Bike(String brand)
	{
		this.brand=brand;
	}

	
	@Override
	public String getBrand() {
		
		return this.brand;
	}

	@Override
	public String speedUp() {
		
		return "This bike is speeding up!";
	}

	@Override
	public String slowDown() {
	
		return "This bike is slowing down!";
	}
	
}
 

public class DefaultMethodExample {

	public static void main(String[] args) {
		
		Vehicle car=new Car("BMW");
		System.out.println(car.getBrand());
		System.out.println(car.slowDown());
		System.out.println(car.speedUp());
		System.out.println(car.applyBreak());
		System.out.println(Vehicle.getHorsePower(2500, 480));
		
		
		Vehicle bike=new Bike("Honda");
		System.out.println(bike.getBrand());
		System.out.println(bike.speedUp());
		System.out.println(bike.slowDown());
		System.out.println(bike.applyBreak());
		System.out.println(Vehicle.getHorsePower(1200, 250));
	}

}
