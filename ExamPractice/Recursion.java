package ExamPractice;

import org.w3c.dom.Node;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(m(234));
		System.out.println("ABCDEFG");
		System.out.println(reverse("ABCDEFG"));
		System.out.println(123456);
		System.out.println(reverse(123456));
		System.out.println(123456);
		reverse2(123456);
		System.out.println("\n2, 10:\t" + gCD(2,10));
		System.out.println("4, 12:\t" + gCD(4,12));
		System.out.println("13, 11:\t" + gCD(13,11));
		System.out.println("28, 49:\t" + gCD(28,49));
	}
	
	// Adds 1 + 1/n + 1/n-1 + ... + 1/1
	public static double m(int n) {
		if(n == 0) { return 0; } // base case
		return m(n-1) + (1./ n);	 //recursive case	
	}
	
	// Reverse String
	public static String reverse(String s) {

		if(s.length() == 1){
			return s;
		}
		return s.charAt(s.length()-1) + reverse(s.substring(1, s.length()-1)) + s.charAt(0);
	}
	
//	private Node reverse(Node n) {
//		Node newHead;
//		
//		// Base case
//		if(n.next == null) 
//			return n;
//		newHead = reverse(n.next);
//		n.next.next = n;
//		n.next = null;
//		return newHead;
//	}
	
	public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
          
        }while(number > 0);
      
        return reverse;
    }
	
	// Reverse a number
	public static void reverse2(int num) {
		if(num < 10) {
			System.out.print(num);
			return;
		}
		System.out.print(num%10);
		reverse2(num/10);
	}
	
	// Find Greatest Common Divisor
	public static int gCD(int num1, int num2) {
		if(num1%num2 == 0) {return num2;}
		return gCD(num2, num1%num2);
	}
}
