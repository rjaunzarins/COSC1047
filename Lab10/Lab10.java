package Lab10;

public class Lab10 {

	public static void main(String[] args) {
		
		System.out.println("Function A: ");
		System.out.println("A(0,3): " + A(0,3));
		System.out.println("A(0,2): " + A(0,2));
		System.out.println("A(1,4): " + A(1,4));
		System.out.println("A(2,4): " + A(2,4));
		System.out.println("A(3,4): " + A(3,4));
		System.out.println("A(4,1): " + A(4,1));
		System.out.println("A(5,0): " + A(5,0));
		System.out.println();
		for(int i = 1; i <= 20; i++)
			System.out.print(B(i) + " ");
	}
	
	public static int A(int m, int n) {
		if(m > 0 && n == 0) 
			return A(m-1,1);	
		
		else if(m > 0 && n > 0) 
			return A(m-1,A(m,n-1));
		else
			return n+1;
	}
	
	public static int B(int n) {
		if(n == 1 || n == 2)
			return 1;
		else 
			return B((n - B(n-1))) + B((n - B(n-2)));
	}
}
