package PreLab3;

import java.util.Scanner;

public class SetMain {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		Set s = new Set();
		
		
		System.out.print("Do you want to enter a value? ");
		String str = keyb.nextLine();
		
		while(str.equalsIgnoreCase("Yes") || str.equalsIgnoreCase("Y")) {
			
			System.out.print("Enter value: ");
			s.add(keyb.nextInt());
			
			System.out.print("Do you want to enter a value? ");
			keyb.nextLine();
			str = keyb.nextLine();
		}
	
		System.out.println("The size of arr is: " + s.getLength());		
		System.out.println("The number of items is: " + s.getNumItems());		
		System.out.println(s.toString());
		
		keyb.close();
	}

}
