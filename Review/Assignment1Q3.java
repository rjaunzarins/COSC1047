package Review;

import java.util.Scanner;

public class Assignment1Q3 {

	public static void main(String[] args) {
		
		// Uses Die class
		Scanner keyb = new Scanner(System.in);
		
		System.out.print("Creating two dice - one with 6 sides, enter number for the second: ");
		int sides = keyb.nextInt();
		
		Die d1 = new Die();
		Die d2 = new Die(sides);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
		System.out.println("Rolling each separately and printing values:");
		d1.roll();
		d2.roll();
		
		System.out.println("Die 1 showing: " + d1.getValue() + "]");
		System.out.println("Die 2 showing: " + d2.getValue() + "]");
		System.out.println("Sum of dice: " + (d1.getValue() + d2.getValue()));
		
		System.out.println("\nFor loop to roll 10 times and print value: ");
		System.out.println("Die 1\t\tDie2\t\tSum");
	
		for(int i = 0; i < 10; ++i) {
			d1.roll();
			d2.roll();
			int sum = d1.getValue() + d2.getValue();
			System.out.println(d1.getValue() + "\t\t" + d2.getValue() + "\t\t" + sum);
		}

	}

}
