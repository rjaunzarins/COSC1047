package Assignment1;
import java.util.Scanner;

public class Assignment1Main {

	public static void main(String[] args) {
		
		Scanner keyb = new Scanner(System.in);
		
		// Set degree to -1 and validate input >= 0
		int degree = -1;
		while(degree < 0) {
			System.out.print("Enter degree for polynomial: ");
			degree = keyb.nextInt();
		}
		
		// Create Polynomial Object
		Polynomial poly1 = new Polynomial(degree+1);
		
		// Get coefficients
		for( int i = 0; i < poly1.getDegree(); i++) {
			System.out.print("Coeff for degree: ");
			double coeff = keyb.nextDouble();
			poly1.setCoefficient(i, coeff);
		}
		
		// Print equation
		System.out.println(poly1.toString());
		
		System.out.print("Enter a value for x: ");
		while(keyb.hasNextDouble()) {
			// Get 'X' value
			double xVal = keyb.nextDouble();
			System.out.printf("For x = %.2f, polynomial = %.2f \n", xVal, poly1.evaluate(xVal));
			System.out.print("Enter a value for x: ");
		}
		
		// Close Scanner
		keyb.close();
	}

}
