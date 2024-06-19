package Assignment0;
import java.util.Scanner;

public class Assignment0 {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		int arraySize = getArraySize(keyb);
		int[] array = createArray(arraySize, keyb);
		printArray(array);
		printReversed(array);
		printEvenValues(array);
		printEvenIndexes(array);
		countOccurrences(keyb, array);
		
		keyb.close();
	}
	
	/**
	 * getArraySize method returns the size of an array
	 * @param keyb Scanner for keyboard input
	 * @return The size of the array
	 */
	public static int getArraySize(Scanner keyb) {
		System.out.print("Enter size of array: ");
		return keyb.nextInt();
	}
	
	/**
	 * createArray method creates and fills an int array
	 * @param arraySize The size of the array
	 * @param keyb Scanner for keyboard input
	 * @return The array created
	 */
	public static int[] createArray(int arraySize, Scanner keyb) {
		
		int[] array = new int[arraySize];
		for ( int i = 0; i < array.length; i++ ) {
			System.out.print("Enter value for element " + i + ": " );
			array[i] = keyb.nextInt();
		}
		return array;
	}
	
	/**
	 * printArray method prints array separated by commas
	 * @param array The array to print
	 */
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++ ) {
			if (i < array.length-1 )
				System.out.print(array[i] + ", ");
			else
				System.out.print(array[i]);
		}
		System.out.println();
	}
	
	/**
	 * printReversed method prints the elements in reverse
	 * @param array The array to print
	 */
	public static void printReversed(int[] array) {
		for ( int i = array.length - 1; i >= 0; i-- ) {
			if (i > 0)
				System.out.print(array[i] + ", ");
			else
				System.out.print(array[i]);
		}
		System.out.println();
	}
	
	/**
	 * printEvenValues array print values with even numbers in elements
	 * @param array The array to be printed
	 */
	public static void printEvenValues(int[] array) {
		for(int i = 0; i < array.length; i++ ) {
			if(array[i] % 2 == 0)
				System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * printEvenIndexes method prints elements with even indexes
	 * @param array The array
	 */
	public static void printEvenIndexes(int[] array) {
		for(int i = 2; i < array.length; i+=2) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * countOccurences method counts the occurrences of a number
	 * @param keyb Scanner for keyboard input
	 * @param array The array to search
	 */
	public static void countOccurrences(Scanner keyb, int[] array) {
		System.out.print("Enter a number to search for: ");
		int search = keyb.nextInt();
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == search)
				++count;
		}
		System.out.println("The number of occurrences of " + search + 
						   " is: " + count);
	}
}
