package ExamPractice;

public class Question7 {

	public static void main(String[] args) {
		
		// Counter for going to next line in print statements
		int count = 0;
		final int num = 100;
		System.out.println("Sum: " + m(num, count));
		System.out.println("Sum: " + m(num));
	}
	
	/**
	 * m Method - Println each fraction
	 * Sum 1 over n down to zero
	 * @param n The number to be added (1/n)
	 * @param count A counter to keep track of how many fractions are on lines
	 * @return The sum of the fractions
	 * @throws IllegalArgumentException
	 */
	public static double m(int n, int count) throws IllegalArgumentException {
		// Iterate count to keep track of number of fractions on each line
		count++; 
		
		// If n > 1 print the fraction plus "+", else print n only (last n)
		if(n > 1)	{ System.out.print("1/" + n + " + "); }	
		else if(n == 1) { System.out.println(n); }
		
		// If count is a multiple of 13 println to go to next line
		if(count != 0 && count%13 == 0) { System.out.println(); }
		
		// Base Case - If n == 0 return 0
		if(n == 0) { return 0; } 

		// Recursive Case - If n > 1 call m(passing n-1) and add it to fraction of n
		else { return m(n - 1, count) + (double)1/n; }
	}
	
	/**
	 * m Method - display only sum
	 * Simple version without all the print statements
	 * @param n The number to be added (1/n)
	 * @return The sum of the fractions
	 */
	public static double m(int n) {
		if(n == 0) return 0;  //Base Case
		else return m(n-1) + (double)1/n;  //Recursive Case
	}

}
