package Chapter16;

import java.lang.reflect.Array;

public class ProgrammingChallenges {

	public static void main(String[] args) {
		System.out.println(multiplication(4,4));
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean b = isMember(arr, arr.length-1, 5);
		System.out.println(b);
		System.out.println("Sum of foo: " + foo(3));
		System.out.println("Return of foo2: " + foo2(345, 10));
		System.out.println("Return of fun: " + fun(4, 3));
		System.out.println("Return of fun2: " + fun2(5));
	}
	
	// Recursive method to multiply y, x times
	public static int multiplication(int x, int y) {
		// If x equals 0 youve reached the correct number of iterations
		if(x == 0)
			return 0;
		// Else, add y to the call of multiplication
		else
			return y + multiplication(x-1, y);
	}
	
	// Search array for a specified value. Return true if found, false if not
	public static boolean isMember(int[] arr, int n, int num) {
		// If the count has gone past first element return false
		if(n < 0)
			return false;
		// If the element is equal to num return true
		else if(arr[n] == num)
			return true;
		//else, return isMember with n decremented
		else
			return isMember(arr, n-1, num);
	}
	
	public static double foo(int n) {
		int i;
		double sum;
		if (n == 0) {
			return 1.0;
		} 
		else {
			sum = 0.0;
			for (i = 0; i < n; i++) {
				sum += foo(i);
				System.out.println(i);
			}
		return sum;
		}
	}
	
	// Assignment 2 - #1, 2
	public static int foo2(int n, int r) {
		if( n > 0 )
			return ( n % r + foo2( n / r, r ) );
		else
			return 0;
	}

	// Assignment 2 - #3
	public static int fun( int x, int y ) {
		if( x == 0) return y;
		return fun( x - 1, x + y );
	}
	
	// Assignment 2 - #4
	public static int fun2( int n ) {
		int x = 1;
		if( n == 1 ) return x;
		for( int k = 1; k < n; ++k )
			x = x + fun2( k ) * fun2( n - k );
		return x;
	}
}
