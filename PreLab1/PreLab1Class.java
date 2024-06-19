package PreLab1;
import java.util.Scanner;

public class PreLab1Class {
	
	/**
	 * createArray method - creates and array of 5
	 * and fills each element with a string
	 * @param keyb Scanner for keyboard input
	 * @return - The String array
	 */
	
	public static String[] createArray(Scanner keyb) {
		
		String[] array = new String[5];
		for(int i = 0; i < array.length; i++) {
			System.out.print("Enter a String: ");
			array[i] = keyb.nextLine();
		}
		
		return array;
	}
	
	
	/**
	 * bubblesortArray method sorts a String array 
	 * in alphanumeric order
	 * @param array
	 */
	public static void bubbleSort(String[] array)
    {
		// Print array before sort
		System.out.println("Before Sort: ");
        toString(array);
        System.out.println();
        
		for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
		
		// Print array after sort
		System.out.println("After Sort: ");
        toString(array);
        System.out.println();
    }
	
	
	public static void selectionSort(String[] array) {
		
		// Print array before sort
		System.out.println("Before Sort: ");
        toString(array);
        System.out.println();
        
		String minString;
		int minIndex;
		for(int i = 0; i < array.length - 1; i++) {
			minString = array[i];
			minIndex = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j].compareToIgnoreCase(minString) < 0) {
					minString= array[j];
					minIndex = j;
				}
			}
			array[minIndex] = array[i];
			array[i] = minString;
			
		}
		
		// Print array after sort
		System.out.println("After Sort: ");
        toString(array);
        System.out.println();
	}
	
	public static void insertionSort(String[] array) {
		
		// Print array before sort
		System.out.println("Before Sort: ");
        toString(array);
        System.out.println();
		        
		for(int i = 1; i < array.length; i++)   {  
	        String temp = array[i];  
	        int j = i-1;  
	        while(j >= 0 && temp.compareToIgnoreCase(array[j]) <= 0)   {  
	            array[j+1] = array[j];   
	            j = j-1;  
	        }   
	        array[j+1] = temp;  
	    }
		
		// Print array after sort
		System.out.println("After Sort: ");
        toString(array);
        System.out.println();
	}
	/**
	 * sequentialSearch method searches for value in String array
	 * @param array The String array
	 * @param search The search String
	 * @return
	 */
	public static int sequentialSearch(String[] array, String search) {
		
		
		for ( int i = 0; i < array.length; i++ ) {
			if ( array[i].compareToIgnoreCase(search) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	 * toString method - prints array separated by commas
	 * @param array
	 */
	public static void toString(String[] array) {
		
		for ( int i = 0; i < array.length; i++ ) {
			if ( i == array.length-1)
				System.out.print(array[i]);
			else
				System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
	
	
	/**
	 * getSearchString method
	 * @param keyb Scanner for keyboard input
	 * @return The search String
	 */
	public static String getSearchString(Scanner keyb) {
		
		System.out.print("Enter search term: ");
		String str = keyb.nextLine();
		
		return str;
	}
}
