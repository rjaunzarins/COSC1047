package Review;

import java.util.Scanner;

public class Assignment0Q2 {

	public static void main(String[] args) {
		
		// Uses the Car class
		Scanner keyb = new Scanner(System.in);
		
		System.out.print("Enter Make of car: ");
		String make = keyb.nextLine();
		System.out.print("Enter year of car: ");
		int year = keyb.nextInt();
		
		Car car = new Car(year, make);

		System.out.println("Speed of car: " + car.getSpeed());
		car.accelerate();
		
		for(int i = 0; i < 5; i++) {
			car.accelerate();
		}
		
		System.out.println("Speed of car: " + car.getSpeed());
		
		int countBrakes = 0;
		while(car.getSpeed() != 0) {
			car.brake();
			countBrakes++;
		}
		
		System.out.println("Speed of car: " + car.getSpeed());
		System.out.println("The brakes were pressed " + countBrakes + " times.");
	}
}
