package Lab3;

import java.util.Scanner;

public class Lab3Main {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		Set s = new Set();
		
		
		System.out.print("Do you want to enter a value? ");
		String str = keyb.nextLine();
		
		while(str.equalsIgnoreCase("Yes") || str.equalsIgnoreCase("Y")) {
			
			System.out.print("Enter value: ");
			boolean noCopies = s.add(keyb.nextInt());
			if (noCopies)
				System.out.println("There are NO copies");
			else
				System.out.println("There are copies. The value was not added");
			
			
			System.out.print("Do you want to enter a value? ");
			keyb.nextLine();
			str = keyb.nextLine();
		}
	
		System.out.println("The size of arr is: " + s.getLength());		
		System.out.println("The number of items is: " + s.getNumItems());		
		System.out.println(s.toString());
		
		Set s1 = new Set( s );
		System.out.println("The size of arr in copy is: " + s1.getLength());		
		System.out.println("The number of items in copy is: " + s1.getNumItems());		
		System.out.println(s1.toString());
		
		keyb.close();
	}

}


