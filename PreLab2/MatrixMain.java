package PreLab2;

import java.util.Scanner;

public class MatrixMain {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		System.out.print("How many rows: ");
		int rows = keyb.nextInt();
		System.out.print("How many columns: ");
		int cols = keyb.nextInt();
		
		Matrix m = new Matrix(rows, cols);
		
		// Fill Array
		m.fillArray(keyb);
		
		
		// Set elements individually
		/*
		// Automatically ask until all elements have been set
		for (int i = 0; i < rows*cols; i++) {
			System.out.print("Enter row, column, and value: ");
			int row = keyb.nextInt();
			int col = keyb.nextInt();
			double val = keyb.nextDouble();
			keyb.nextLine();
			
			// Set value in element
			m.setValue(row, col, val);
		}
		*/
		
		// Ask loop to set elements
		System.out.print("Do you want to enter another value? ");
		keyb.nextLine();
		String cont = keyb.nextLine();
		
		while (cont.equalsIgnoreCase("Yes") || cont.equalsIgnoreCase("Y")) {
			System.out.print("Enter row, column, and value: ");
			int row = keyb.nextInt();
			int col = keyb.nextInt();
			double val = keyb.nextDouble();
			keyb.nextLine();
			
			// Set value in element
			m.setValue(row, col, val);
			
			System.out.print("Do you want to enter another value? ");
			cont = keyb.nextLine();
		}
		
		// Get value in an element
		cont = "Yes";
		while (cont.equalsIgnoreCase("Yes") || cont.equalsIgnoreCase("Y")) {
			System.out.print("Enter row and column to get: ");
			int row = keyb.nextInt();
			int col = keyb.nextInt();
			
			// Print value in element
			System.out.println(m.getValue(row, col));
			
			// Eat newline and ask to continue
			keyb.nextLine();
			System.out.print("Do you want to find another value? ");
			cont = keyb.nextLine();
		}
		
		// Print array with toString
		System.out.println(m.toString());
		System.out.println("Done");
		
		keyb.close();
	}

}
