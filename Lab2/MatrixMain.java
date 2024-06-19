package Lab2;

import java.util.Scanner;

public class MatrixMain {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		// Create and fill matrix 1
		System.out.print("How many rows for matrix 1? ");
		int rows = keyb.nextInt();
		System.out.print("How many columns for matrix 1? ");
		int cols = keyb.nextInt();
		
		Matrix m1 = new Matrix(rows, cols);

		// Fill Array
		m1.fillArray(keyb);
		
		
		// Create and fill matrix 2
		System.out.print("How many rows for matrix 1? ");
		rows = keyb.nextInt();
		System.out.print("How many columns for matrix 1? ");
		cols = keyb.nextInt();
		
		Matrix m2 = new Matrix(rows, cols);
		
		// Fill Array
		m2.fillArray(keyb);
		
		// Determine if they are equal
		m1.equals(m2);

	}

}
