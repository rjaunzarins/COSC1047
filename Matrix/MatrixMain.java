package Matrix;
import java.util.Scanner;

public class MatrixMain {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		
		System.out.println("3x4 Matrix Starting Matrix: ");
		Matrix m1 = new Matrix();
		System.out.println();
		
		boolean solved = false;
		while(!solved) {
			m1.checkX1();
			solved = m1.checkSolved(solved);
			if(solved)
				break;
			System.out.println("checkCol1Zero1");
			m1.checkCol1Zero1();
			solved = m1.checkSolved(solved);
			if(solved)
				break;
			System.out.println("checkCol1Zero2*");
			m1.checkCol1Zero2();
			solved = m1.checkSolved(solved);
			if(solved)
				break;
			System.out.println("checkCol2Zero1");
			m1.checkCol2Zero1();
			solved = m1.checkSolved(solved);
			if(solved)
				break;
			System.out.println("checkCol2Zero2");
			m1.checkCol2Zero2();
			solved = m1.checkSolved(solved);
			if(solved)
				break;
			System.out.println("checkCol3Zero1");
			m1.checkCol3Zero1();
			solved = m1.checkSolved(solved);
			if(solved)
				break;
			System.out.println("checkCol3Zero2");
			m1.checkCol3Zero2();
			
			/*
			System.out.print("Enter row to reduce: ");
			int reduceRow = keyb.nextInt() - 1;
			System.out.print("Enter row to reduce by: ");
			int reduceBy = keyb.nextInt() - 1;
			System.out.print("Multiple: ");
			int multiple = keyb.nextInt();
			
			System.out.println();
			m1.reduceRow(reduceRow, reduceBy, multiple);
			System.out.println();
			*/
		}
		
		m1.printSolution();
		System.out.println("\nDone");
		keyb.close();
	}

}

/*
Improvements -
	- make it so the loop stops if row 4 cannot be divided by zero as integer and 
	  the only option is to divide the row by itself

*/