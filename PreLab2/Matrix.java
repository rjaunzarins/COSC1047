package PreLab2;

import java.util.Scanner;

public class Matrix {

	private double[][] array;
	
	/**
	 * Constructor
	 * @param row The number of rows
	 * @param col The number of columns
	 */
	public Matrix(int row, int col) {
		
		this.array = new double[row][col];
		
		for (int i = 0; i < this.array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}
	}
	
	/**
	 * get Method 
	 * @param row The row number
	 * @param col The column number
	 * @return The value in element specified
	 */
	public double getValue(int row, int col) {
		
		return array[row][col];
	}
	
	/**
	 * setValue method
	 * @param row The row number
	 * @param col The column number
	 * @param value Value to set element to
	 */
	public void setValue(int row, int col, double value) {
		
		array[row][col] = value;
	}
	
	public void fillArray(Scanner keyb) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print("Enter value for element [" + i + "][" + j + "] :");
				array[i][j] = keyb.nextDouble();
			}
		}
	}
	
	
	
	
	/**
	 * toString method
	 * @return The array as a string
	 */
	public String toString() {
		
		String str = "";
		
		for (int i = 0; i < this.array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				// If first element in row, no space before
				str += String.format("%15.2f\t", array[i][j]);
			}
			if ( i != array.length-1)
				str += "\n";
		}
		return str;
	}
	
} // End Class


