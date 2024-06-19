package Matrix;
import java.util.Scanner;

public class Matrix {

	private int[][] matrix;
	private Scanner keyb;
	
	/**
	 * NO_ARG CONSTRUCTOR - construct pre-made Matrix
	 */
	public Matrix() {
		matrix = new int[3][4];
		matrix[0][0] = 1;
		matrix[0][1] = 1;
	    matrix[0][2] = -1;
	    matrix[0][3] = -2;
	    matrix[1][0] = 2;
	    matrix[1][1] = -1;
	    matrix[1][2] = 1;
	    matrix[1][3] = 5;
	    matrix[2][0] = -1;
	    matrix[2][1] = 2;
	    matrix[2][2] = 2;
	    matrix[2][3] = 1;
		
		printMatrix();
		
	}
	/**
	 * CONSTRUCTOR
	 * @param rows The number of rows
	 * @param cols The number of columns
	 */
	public Matrix(int rows, int cols) {
		keyb = new Scanner(System.in);
		
		this.matrix = new int[rows][cols];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print("Enter coefficient for [" + i + "] [" + j + "]: ");
				matrix[i][j] = keyb.nextInt();
			}
		}	
		printMatrix();
	}
	
	/**
	 * reduceRow Method
	 * @param reduceRow Row to reduce
	 * @param reduceBy Row to reduce by
	 * @param multiple Number to multiply reduceBy by
	 */
	public void reduceRow(int reduceRow, int reduceBy, int multiple) {
		
//		// If multiple is less than 0 the line needs to be added |multiple| times
//		if(multiple < 0) {
//			for(int i = 0; i < Math.abs(multiple); i++) {	
//				for (int j = 0; j < matrix[0].length; j++) {
//					matrix[reduceRow][j] = matrix[reduceRow][j] + matrix[reduceBy][j];
//				}
//			}
//			System.out.println("Reduce Row " + (reduceRow + 1) + " by Row " + (reduceBy + 1) +  " - Multiple " + multiple + ": " );
//			printMatrix();
//			System.out.println();
//			checkRowSolved();
//		}
//		// Else subtract multiple number of times
//		else {
//			for(int i = 0; i < multiple; i++) {	
//				for (int j = 0; j < matrix[0].length; j++) {
//					matrix[reduceRow][j] = matrix[reduceRow][j] - matrix[reduceBy][j];
//				}
//			}
//			System.out.println("Reduce Row " + (reduceRow + 1) + " by Row " + (reduceBy + 1) +  " - Multiple " + multiple + ": ");
//			printMatrix();
//			System.out.println();
//			checkRowSolved();
//		}
		
		for(int i = 0; i < matrix[0].length; ++i) {
			matrix[reduceRow][i] = matrix[reduceRow][i] - multiple * matrix[reduceBy][i];
		}
		
		System.out.println("Reduce Row " + (reduceRow + 1) + " by Row " + (reduceBy + 1) +  " - Multiple " + multiple + ": " );
		printMatrix();
		System.out.println();
		checkRowSolved();
	}
	
	/**
	 * checkRowSolved - If row is reduced and only needs to be divided. Divide by itself
	 * *******************
	 * Need to find a way to stop the program looping if int cannot be divided with % 0
	 * *******************
	 */
	public void checkRowSolved() {
		if(matrix[0][1] == 0 && matrix[0][2] == 0 && matrix[0][0] != 1) {
			int division = matrix[0][0];
			matrix[0][0] /= division;
			matrix[0][matrix[0].length - 1] /= division;
			System.out.println("\nDivided row 1 by itself");
			printMatrix();	
			System.out.println();
		}
		
		if(matrix[1][0] == 0 && matrix[1][3] == 0 && matrix[1][1] != 1) {
			int division = matrix[1][1];
			// Avoid divide by 0
			if(division != 0) {	
				// If the number can be divided by division with remainder 0
				if(matrix[1][3] % division == 1) {	
					matrix[1][1] /= division;
					matrix[1][matrix[0].length - 1] /= division;
					System.out.println("\nDivided row 2 by itself");
					printMatrix();
					System.out.println();
				}
				// Else, print cannot be solved as an int
				else
					printMatrix();
					System.out.println("Cannot be solved with integers");
					checkSolved(true);
			}	
		}
		
		// Need to add if the row divided by itself gives a fraction in col 4
		// then get fraction
		if(matrix[2][0] == 0 && matrix[2][1] == 0 && matrix[2][2] != 1) {
			int division = matrix[2][2];
			// Avoid divide by 0
			if(division != 0) {	
				// If the number can be divided by division with remainder 0
				if(matrix[2][3] % division == 0) {	
					matrix[2][2] /= division;
					matrix[2][matrix[0].length - 1] /= division;
					System.out.println("\nDivided row 3 by itself");
					printMatrix();
					System.out.println();
				}
				// Else, print cannot be solved as an int
				else
					printMatrix();
					System.out.println("Cannot be solved with integers");
					checkSolved(true);
			}
			else 
				checkSolved(true);
		}
	}
	
	/**
	 * checkX1 Method - Checks if [0][0] is a 1. If not find the row to reduce
	 * by and reduce it to 1. Loops through until i*[1][0] or i*[2][0] == [0][0]
	 */
	public void checkX1() {
		int x1 = matrix[0][0];
		for(int i = 0; i <= x1; i++)	
			if(matrix[0][0] != 1) {
				if((matrix[0][0] - matrix[1][0]) * i == 1) {
					reduceRow(2, 1, 1);
					//reduceRow(0, 1, i);
				}
				else if((matrix[0][0] - matrix[2][0]) * i == 1) {
					reduceRow(2, 1, 1);
					//reduceRow(0, 2, i);
			}
		}
	}
	
	/**
	 * checkRow1Zero1 Method - Checks for zeros under x1. Reduces them if they
	 * are not equal to zero.
	 */
	public void checkCol1Zero1() {
		int zero = matrix[1][0];

		if(zero != 0) {
			// Reduce Row 2 by Row 1
			reduceRow(1, 0, zero);
		}
		
	}
	
	/**
	 * checkRow1Zero2 Method - Checks for zeros under x1. Reduces them if they
	 * are not equal to zero.
	 */
	public void checkCol1Zero2() {
		int zero = matrix[2][0];
		
		if(zero != 0) {
			// Reduce Row 3 by Row 1
			reduceRow(2, 0, zero);
		}
	}
	
	/**
	 * checkCol2Zero1 Method - Checks for zeros under x1. Reduces them if they
	 * are not equal to zero.
	 */
	public void checkCol2Zero1() {
		int zero = matrix[0][1];

		if(zero != 0) {
			if(zero - matrix[1][1] == 0) {
				// Reduce Row 1 by Row 2
				reduceRow(0, 1, zero);
			}
			else if(zero - matrix[2][1] == 0) {
				// Reduce Row 1 by Row 3
				reduceRow(0, 2, zero);
			}
			else if(matrix[1][1] - matrix[2][1] == 0) {
				// Reduce Row 2 by Row 3
				reduceRow(1, 2, zero);
			}
			else if(matrix[2][1] - matrix[1][1] == 0) {
				// Reduce Row 3 by Row 2
				reduceRow(1, 2, zero);
			}
		}
		
	}
	
	/**
	 * checkCol2Zero2 Method - Checks for zeros under x1. Reduces them if they
	 * are not equal to zero.
	 */
	public void checkCol2Zero2() {
		int zero = matrix[2][1];
		
		if(zero != 0) {
			// Reduce Row 3 by Row 2
			reduceRow(2, 1, zero);
		}
	}
	
	public void checkCol3Zero1() {
		// Reduce Row 1 by Row 3
		reduceRow(0, 2, matrix[0][2]);
	}
	
	public void checkCol3Zero2() {
		// Reduce Row 2 by Row 3
		reduceRow(1, 2, matrix[1][2]);
	}
	
	/**
	 * checkSolved Method
	 * @return If the matrix is solved or not
	 */
	public boolean checkSolved(boolean solved) {
		if(!solved) {
			if(matrix[2][0] == 0 && matrix[2][1] == 0 && matrix[2][2] == 0 && matrix[2][3] != 0) {
				//System.out.println("0 != " + matrix[2][3] + " - No Solutions");
				return true;
			}
			else if(matrix[2][0] == 0 && matrix[2][1] == 0 && matrix[2][2] == 0 && matrix[2][3] == 0) {
				//System.out.println("Many Solutions");
				return true;
			}
			if(matrix[0][0] != 1)
				return false;
			else if(matrix[1][1] != 1)
				return false;
			else if(matrix[2][2] != 1)
				return false;
			else if(matrix[0][1] != 0 || matrix[0][2] != 0)
				return false;
			else if(matrix[1][0] != 0 || matrix[1][2] != 0)
				return false;
			else if(matrix[2][0] != 0 || matrix[2][1] != 0)
				return false;
			else
				return true;
		}
		else
			return true;
	}

	
	/**
	 * printMatrix Method
	 */
	public void printMatrix() {
		System.out.println(" -------------------");
		for(int i = 0; i < matrix.length; i++) {
			
			System.out.print("|");
			
			for(int j = 0; j < matrix[i].length; j++) {
				
				if(j == matrix[i].length - 1)
					System.out.printf(" |%3d  |\n", matrix[i][j]);
				else	
					System.out.printf("%4d", matrix[i][j]);
			}
		}
		System.out.println(" -------------------");
	}
	
	public void printSolution() {
		if(matrix[0][0] == 1) {	
			if(matrix[1][1] == 1) {
				// Unique Solution
				if(matrix[2][2] == 1) {
					System.out.println("Unique Solution: ");
					System.out.printf("X1 = %4d\n", matrix[0][3]);
					System.out.printf("X2 = %4d\n", matrix[1][3]);
					System.out.printf("X3 = %4d\n", matrix[2][3]);
				}
				else if(matrix[2][2] == 0) {
					// Many Solutions
					if(matrix[2][3] == 0) {
						System.out.println("Many Solutions: ");
						manySolutions();
						
					}
					// No Solution
					else
						System.out.println("0 != " + matrix[2][3] + " - No Solutions");
				}
			}
	
		}
	}
	
	public void manySolutions() {
		
		// Row 1 - If there is no X2
		if(matrix[0][1] == 0 && matrix[0][2] != 0) {
			System.out.println("X1 + " + matrix[0][2] + "X3 = " + matrix[0][3]);
		}
		
		// Row 1 - If there is no X3
		if(matrix[0][1] != 0 && matrix[0][2] == 0) {
			System.out.println("X1 + " + matrix[0][1] + "X2 = " + matrix[0][3]);
		}
		
		// Row 1 - If there is an X2 and X3
		if(matrix[0][1] != 0 && matrix[0][2] != 0) {
			System.out.println("X1 + " + matrix[0][1] + "X2 + " + (-1 * matrix[0][2]) + "X3 = " + matrix[0][3]);
		}
		
		// Row 2 - If X2 = 1 & X3 = 0
		if(matrix[1][1] == 1 && matrix[1][2] == 0) {
			System.out.println("X2 = " + matrix[1][3]);
		}
		
		//Row 2 - If X2 = 1 & X3 != 0
		if(matrix[1][1] == 1 && matrix[1][2] != 0) {
			System.out.println("X2 + " + matrix[1][2] + "X3 = " + matrix[1][3]);
		}
		
		// Row 2 - If X3 = 1
		if(matrix[1][1] == 0 && matrix[1][2] == 1) {
			System.out.println("X3 = " + matrix[1][3]);
		}
		manySolSimpR1();
		manySolSimpR2();
		letREqual();
	}
	
	public void manySolSimpR1() {
		
		System.out.println("\nSolve for X: ");
		
		// X1 == 1, X2 != 0, X3 == 0
		if(matrix[0][1] != 0 && matrix[0][2] == 0) {
			if(matrix[0][3] > 0) {
				if(matrix[0][1] > 1 || matrix[0][1] < -1)
					System.out.println("X1 = " + ((-1)*matrix[0][1]) + "X2 + " + matrix[0][3]);
				else if(matrix[0][1] == 1) 
					System.out.println("X1 = -X2 + " + matrix[0][3]);
				else if(matrix[0][1] == -1) 
					System.out.println("X1 = X2 + " + matrix[0][3]);
				
			}
			else if(matrix[0][3] < 0) {
				if(matrix[0][1] > 1 || matrix[0][1] < -1)
					System.out.println("X1 = " + ((-1)*matrix[0][1]) + "X2 - " + (-1 * matrix[0][3]));
				else if(matrix[0][1] == 1)
					System.out.println("X1 = -X2 + " + matrix[0][3]);
				else if(matrix[0][1] == -1) 
					System.out.println("X1 = X2 + " + matrix[0][3]);
			}
			else
				System.out.println("X1 = " + ((-1)*matrix[0][1]) + "X2");
		}

		// X1 == 1, X2 == 0, X3 != 0
		else if(matrix[0][1] == 0 && matrix[0][2] != 0) {
			if(matrix[0][3] > 0) {
				if(matrix[0][2] > 1 || matrix[0][1] < -1)
					System.out.println("X1 = " + ((-1)*matrix[0][2]) + "X3 + " + matrix[0][3]);
				else if(matrix[0][2] == 1) 
					System.out.println("X1 = -X3 + " + matrix[0][3]);
				else if(matrix[0][2] == -1) 
					System.out.println("X1 = X3 + " + matrix[0][3]);
			}
			else if(matrix[0][3] < 0) {
				if(matrix[0][2] > 1 || matrix[0][1] < -1)
					System.out.println("X1 = " + ((-1)*matrix[0][2]) + "X3 - " + (-1 * matrix[0][3]));
				else if(matrix[0][2] == 1)
					System.out.println("X1 = -X3 + " + matrix[0][3]);
				else if(matrix[0][2] == -1) 
					System.out.println("X1 = X3 + " + matrix[0][3]);
			}
			else if(matrix[0][3] == 0)
				System.out.println("X1 = " + ((-1)*matrix[0][2]) + "X3");
		}

		// X1 == 1, X2 == 0, X3 == 0
		else if(matrix[0][1] == 0 && matrix[0][2] == 0) {
			System.out.println("X1 = " + matrix[0][3]);
		}
		else
			System.out.println("Error!");
		
	}
	
	public void manySolSimpR2() {
		
		// X2 = 1, X3 = 0
		if(matrix[1][1] == 1 && matrix[1][2] == 0) {
			System.out.println("X2 = " + matrix[1][3]);
		}
		
		// X2 = 1, X3 !=0
		if(matrix[1][1] == 1 && matrix[1][2] !=0) {
			if(matrix[1][3] > 0) {	
				System.out.println("X2 = " + (-1 * matrix[1][2]) + "X3 + " + matrix[1][3]);
			}
			else if(matrix[1][3] < 0) {
				System.out.println("X2 = " + (-1 * matrix[1][2]) + "X3 - " + (-1 * matrix[1][3]));
			}
			else
				System.out.println("X2 = " + matrix[1][2]);
		}
		
		// X2 = 0, X3 = 1
		if(matrix[1][1] == 0 && matrix[1][2] == 1) {
			System.out.println("X3 = " + matrix[1][3]);
		}
	}
	
	public void letREqual() {
		
		// If Row 2 X2 = 1, let X3 = r
		if(matrix[1][1] == 1) {
			System.out.println("\nLet X3 = r: ");
			
			if(matrix[0][2] == 0) {
	//			System.out.println("X1 = " + matrix[0][3]);
	//			System.out.println("X2 = " + matrix[1][2] + "r");
				System.out.println("X3 = r");
			}
			else if(matrix[0][2] >= 1 || matrix[0][2] <= -1) {
				
			}
		}
		// Else, let X2 = r
		else {
			System.out.println("\nLet X2 = r: ");
			
			if(matrix[0][1] == 0) {
				System.out.println("X1 = " + matrix[0][3]);
				System.out.println("X2 = r");
				System.out.println("X3 = " + matrix[1][3]);
			}
			else if(matrix[0][1] >= 1 || matrix[0][1] <= -1){
				if(matrix[0][3] > 0)
					System.out.println("X1 = " + (-1 * matrix[0][1]) + "r + " + matrix[0][3]);
				else if(matrix[0][3] < 0)
					System.out.println("X1 = " + (-1 * matrix[0][1]) + "r + " + matrix[0][3]);
				else
					System.out.println("X1 = " + (-1 * matrix[0][1]) + "r");
				System.out.println("X2 = r");
				System.out.println("X3 = " + matrix[1][3]);
			}
		}
	}
}
