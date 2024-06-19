package ExamPractice;

public class Question6 {

	public static void main(String[] args) {
		
		// Number to sum elements
		int num = 101;
		// Print add before the individual elements. Each element
		// will be printed from within the mystery method
		System.out.print("Add: ");
		System.out.println("Sum of elements in " + num + ": " + mystery(num));
	}
	
	/**
	 * mystery Method - 
	 * Returns the sum of each element in the integer passed to it
	 * @param n The number to sum the elements of
	 * @return The total of each number in n
	 */
	public static int mystery(int n) {
		if(n == 0) return 0;  //Base case
				
		return mystery (n/10) + n%10;  //Recursive Case
	}

}

// What is the output of mystery(0)?
// The output is 0

// What is the output of mystery(25)?
// The output is 7

// What is the output of mystery(101)?
// The output is 2

