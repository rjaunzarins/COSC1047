package Chapter16;

public class ReviewQuestion5 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(myMethod(x));
		sign(10);
	}
	
	public static int myMethod(int num) {
		if(num <= 0)
			return 0;
		else 
			return myMethod(num-1) + num;
	}
	
	public static void sign(int n) {
		if(n == 0)
			return;
		else
			System.out.println("No Parking! " + n);
			sign(n-1);
	}
}
