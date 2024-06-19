package Chapter16;

import java.util.Scanner;

public class GDCdemo {

	public static void main(String[] args) {
		
		int num1, num2;
		
		// Create Scanner
		Scanner keyb = new Scanner(System.in);
		
		// Get the first number from the user
		System.out.print("Enter an int: ");
		num1 = keyb.nextInt();
		
		// Get the second number from user
		System.out.print("Enter another int: ");
		num2 = keyb.nextInt();
		
		// Display the GCD
		System.out.println("The GDC is: " + gdc(num1,num2));
	}
	
	public static int gdc(int x, int y) {
		if(x % y == 0)
			return y;
		else
			return gdc(y, x % y);
	}

}
