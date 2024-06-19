package PreLab6;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DynamicArrayMain {

	public static void main(String[] args) {
		
		DynamicArray arr1 = new DynamicArray();
		arr1.pushBack(1);
		arr1.pushBack(2);
		arr1.pushBack(3);
		arr1.pushBack(4);
		arr1.pushBack(5);
		arr1.pushBack(6);
		arr1.pushBack(7);
		arr1.pushBack(8);
		arr1.pushBack(9);
		
		// Print Initial DynamicArray object
		System.out.println("toString: \n" + arr1.toString());
		writeFile(arr1);
		readFile();
		
		// Add 2 elements and reprint DynamicArray object
		arr1.pushBack(10);
		arr1.pushBack(11);
		System.out.println("\nPushBack arr1 - \ntoString: \n" + arr1.toString());
		writeFile(arr1);
		readFile();
		
		// Remove the last two elements and reprint DynamicArray
		arr1.popBack();
		arr1.popBack();
		System.out.println("\nPopBack arr1 - \ntoString: \n" + arr1.toString());
		writeFile(arr1);
		readFile();
	}
	
	/**
	 * writeFile Method - write the object to a .dat file
	 * @param d The DynamicArray to write to file
	 * @exception e FileNotFoundException
	 * @exception ex IOException
	 */
	public static void writeFile(DynamicArray d) {
		
		// Write DynamicArray to file
		try {
			ObjectOutputStream outputFile = new ObjectOutputStream
							 			   (new FileOutputStream("Objects.dat"));
			
			outputFile.writeObject(d);
			outputFile.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	
	}
	
	/**
	 * readFile Method - Read a file with a DynamicArray object
	 * and print to console with .toString()
	 * @exception e EOFException
	 * @exception ex ClassNotFoundException
	 * @exception exc IOException
	 * 
	 */
	public static void readFile() {
		
		// Read object from file
		try {
			ObjectInputStream inputFile = new ObjectInputStream(
										  new FileInputStream("Objects.dat"));
			
			boolean endOfFile = false;
			DynamicArray arr2;
			System.out.println("Read From File: ");
			while(!endOfFile) {
				try {
					arr2 = (DynamicArray) inputFile.readObject();
					System.out.println(arr2.toString());
				}
				catch(EOFException e) {
					endOfFile = true;
				}
				catch(ClassNotFoundException ex) {
					System.out.println(ex.getMessage());
				}
			}
			
			inputFile.close();
		}
		catch(IOException exc) {
			System.out.println(exc.getMessage());
		}
	}
}