package week1.day1;

public class Bike extends Car {
	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		System.out.println("Car Start");
		car.applyBreak();
		car.soundHorn();
		System.out.println("************");
		System.out.println("Bike Start");
		bike.applyBreak();
		bike.soundHorn();
		
		
		
	}
	

}
