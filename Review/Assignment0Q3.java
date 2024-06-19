package Review;

import java.util.Scanner;

public class Assignment0Q3 {

	public static void main(String[] args) {
		// Uses the SortedArray Class
		Scanner keyb = new Scanner(System.in);
		SortedArray arr;
		int size;
		
		do {
		System.out.print("Enter array size between 5 and 10: ");
		size = keyb.nextInt();
		} while(size < 5 || size > 10);
		arr = new SortedArray(size);
		arr.printArray();
		
		int elem = 0;
		while(arr.getNumItems() < arr.getSize()) {
			System.out.print("Enter number until array is full: ");
			arr.setElement(keyb.nextInt());		
		}
		if(arr.getNumItems() == arr.getSize()) {
			System.out.println("Array is full");
		}
		
		arr.printArray();
		System.out.println("Removing last element (numItems-1): ");
		arr.removeElement(arr.getSize()-1);
		
		System.out.println("Removing index 0: ");
		arr.removeElement(0);
		
		System.out.println("Removing index 2: ");
		arr.removeElement(2);
		
		System.out.println("Removing index 2: ");
		arr.removeElement(2);
		
		System.out.println("Removing index 1: ");
		arr.removeElement(1);
		
		System.out.println("Removing index 0: ");
		arr.removeElement(0);
		
		System.out.println("Removing index 0 again: ");
		arr.removeElement(0);
		
	}

}
