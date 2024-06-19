package Review;

import java.util.*;

public class Assignment0Q1 {
	
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		int arrSize = getArraySize(keyb);
		int[]arr = fillArray(arrSize);
		printArraySingleLine(arr);
		printArrayReversedElements(arr);
		printArrayEvenIndicies(arr);
		printArrayEvenIndiciesNoIfStatements(arr);
		System.out.println(countOccurrences(arr, 1));
	}
	
	/**
	 * getArraySize Method
	 * @param keyb A Scanner object for input
	 * @return The array size
	 */
	public static int getArraySize(Scanner keyb) {
		System.out.print("Enter an array size: ");
		return keyb.nextInt();
	}
	
	public static int[] fillArray(int size) {
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			// (int)(Math.random() * (Max - Min + 1)) + 1
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		return arr;
	}
	
	public static void printArraySingleLine(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == 0)
				System.out.print(arr[i] + ", ");
			else if(i >= arr.length-1)
				System.out.printf("%2d\n", arr[i]);
			else
				System.out.printf("%2d, ", arr[i]);
			
		}
	}
	
	public static void printArrayReversedElements(int[] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			if(i == arr.length-1)
				System.out.print(arr[i] + ", ");
			else if(i > 0)
				System.out.printf("%2d, ", arr[i]);
			else
				System.out.printf("%2d\n", arr[i]);				
		}
	}
	
	public static void printArrayEvenIndicies(int[] arr) {
		for(int i = 2; i < arr.length; i++) {
			if(i % 2 == 0) {
				if(i == 2)
					System.out.print(arr[i] + ", ");
				else if(i == arr.length - 2)
					System.out.printf("%2d", arr[i]);
				else
					System.out.printf("%2d, ", arr[i]);
			}	
		}
		System.out.println();
	}
	
	public static void printArrayEvenIndiciesNoIfStatements(int[] arr) {
		for(int i = 2; i < arr.length; i+=2) {
			//If statements are only for output formatting
			if(i == 2)
				System.out.print(arr[i] + ", ");
			else if(i == arr.length - 2)
				System.out.printf("%2d", arr[i]);
			else
				System.out.printf("%2d, ", arr[i]);
		}
		System.out.println();
	}
	
	public static int countOccurrences(int[] arr, int value) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				count++;
			}
		}
		return count;
	}

}
