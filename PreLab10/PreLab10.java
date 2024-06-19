package PreLab10;
import java.util.Scanner;

public class PreLab10 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
	
		// Check if user input is palindrome
		String pal = getPalInput(keyb);	
		if(palindrome(pal))
			System.out.println(pal + " is a Palindrome");
		else
			System.out.println(pal + " is not a Palindrome");

		
		// Sum digits of number entered by user
		int num = getSumInput(keyb);
		int sum = sum(num);
		System.out.println("The sum of the digits in " + num + " is " + sum);
		
		
		// Close keyb
		keyb.close();
	}
	
	/**
	 * getPalInput Method - Get palindrome from user
	 * @param keyb Scanner for input
	 * @return The palindrome String
	 */
	public static String getPalInput(Scanner keyb) {
		System.out.print("Enter palindrome: ");
		return keyb.nextLine();
	}
	
	/**
	 * getSumInput Method = Get number from user
	 * @param keyb Scanner for input
	 * @return The number the user entered
	 */
	public static int getSumInput(Scanner keyb) {
		System.out.print("Enter a number to sum: ");
		return keyb.nextInt();
	}
	
	/**
	 * palindrome Method - Check if String is palindrome recursively 
	 * @param pal The users String
	 * @return If String is palindrome or not
	 */
	public static boolean palindrome(String pal) {
		
		int end = pal.length();
		
		if(end == 0) 
			return true;

		else if(end == 1)
			return true;
		
		if(pal.toLowerCase().charAt(0) == pal.toLowerCase().charAt(end - 1)) 
			return palindrome(pal.substring(1,end-1));
				
		else
			return false;
	}
	
	/**
	 * sum Method - Sums the digits within a number entered by user
	 * @param num The number entered by the user
	 * @return The sum of each digit in the number user entered
	 */
	public static int sum(int num) {
		if(num == 0)
			return 0;
		else
			return (num % 10) + sum((num - (num % 10)) / 10);
	}
}