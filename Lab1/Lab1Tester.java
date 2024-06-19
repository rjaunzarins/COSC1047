package Lab1;
import java.io.*;
import java.util.Scanner;


public class Lab1Tester {

	public static void main(String[] args) throws IOException{
		
		Scanner keyb = new Scanner(System.in);
		System.out.print("Enter filename: ");
		String filename = keyb.nextLine();
		
		//File file = new File(filename);
		//Scanner inFile = new Scanner(file);
		
		//Pass filename to createArray
		String[] array = createArray(filename);
		
		System.out.print("Enter term to search for: ");
		String term = keyb.nextLine();
		int element = search(term, array);
		System.out.println("Element of " + term + " is " + element);
		
		//printArray(array);
		
	
		// Close keyb
		keyb.close();
	}

	public static String[] createArray(String filename) throws IOException {
		
		int count = 0;
		
		// Open file and count lines
		File file = new File(filename);
		Scanner inFile = new Scanner(file);
		
		while(inFile.hasNextLine()) {
			count++;
			inFile.nextLine();
			//System.out.println(inFile.nextLine());
		}
		System.out.println("Line count: " + count);
		// Create array
		String[] array = new String[count];
		inFile.close();
		
		File file1 = new File("Lab1.txt");
		Scanner inFile2 = new Scanner(file1);
		// Copy file to array
		while(inFile2.hasNext()) {
			for(int i = 0; i < array.length; i++) {
				array[i] = inFile2.nextLine();
				//System.out.println(array[i]);
			}
		}
		inFile2.close();
		return array;
	}
	
	public static int search(String term, String[] array) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].equalsIgnoreCase(term))
				return i;
		}
		return -1;
		
		
	}
	
	public static void printArray(String[] array) {
		for(String str : array)
			System.out.println(str);
	}
}
