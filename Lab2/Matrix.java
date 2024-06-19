package Lab2;
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
	 * Copy Constructor
	 * @param m The array to copy
	 */
	public Matrix(Matrix m) {
		
		double[][] arr = new double[m.array.length][m.array[0].length];
		for(int i = 0; i < m.array.length; i++) {
			for(int j = 0; j < m.array[0].length; j++) {
				arr[i][j] = m.array[i][j];
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
	 * equals Method - better version below
	 * @param m The Matrix object
	 * @return If the arrays are equal or not
	 */
	public boolean equals(Matrix m) {
		
		boolean equals = true;
		
		if (array.length == m.array.length) {
			System.out.println("Rows are equal");
			if(array[0].length == m.array[0].length) {
				System.out.println("Cols are equal");
				for(int i = 0; i < array.length; i++) {
					for(int j = 0; j < array[0].length; j++) {
						if(array[i][j] != m.getValue(i, j)) {
							equals = false;
							System.out.println("The element [" + i + "][" + j + 
									           				 "] is not equal");
						}			
					}
				}	
			}
			else {
				System.out.println("The number of cols is different");
				equals = false;
			}	
		}
		else {
			System.out.println("The number of rows is different");
			equals = false;
		}
		
		if(equals == true)
			System.out.println("The arrays are equal");
		
		return equals;
	}
	
	/**
	 * equals2 Method - a better version of the equals method above
	 * @param m The matrix the check
	 * @return If the two instances are equal in every way
	 */
	public boolean equals2(Matrix m) {
		
		// If row length doesn't match return false
		if(array.length != m.array.length)
			return false;
		//If col length doesn't match return false
		if(array[0].length != m.array[0].length)
			return false;
		//Loop through, if element doesn't match return false
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if( array[i][j] != m.array[i][j] )
					return false;
			}
		}
		// If it hasn't returned false after looping through, return true
		return true;
		
	}
	
	/**
	 * getRows Method
	 * @return The number of rows in the array
	 */
	public int getRows() {
		return array.length;
	}
	
	/**
	 * getCols Method
	 * @return The number of columns in the array
	 */
	public int getCols() {
		return array[0].length;
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
