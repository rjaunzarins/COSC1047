package ExamPractice;

public class Polynomial {
	private int degree;
	private double[] coefficients;
	
	public Polynomial(int degree) {
		this.degree = degree;
	}
	
	public int getDegree() {
		return degree; // Temp
	}
	
	public double evaluate(double x) {
		double eval = 0;
		for( int i = 0; i <= degree; i++) {
			if(i < 1) {
				eval += coefficients[i];
				System.out.println("i<1");
				System.out.println(eval);
			}
			else {
				eval += coefficients[i] * Math.pow(x, i);
				System.out.println("i>=1");
				System.out.println(eval);
			}
		}
		return eval;
	}
	
	public void setCoefficient(int idx, double coefficient) {
		coefficients = new double[degree+1];
		coefficients[idx] = coefficient;
	}
	
	public String toString() {
		return "Temp String";
	}
	
//	public static void main(String[] args) {
//		Polynomial p = new Polynomial(2);
//		p.setCoefficient(0, 1.0);
//		p.setCoefficient(1, 3.0);
//		p.setCoefficient(2, 1.0);
//		for(int i = 0; i < p.coefficients.length; i++) {
//			System.out.print(p.coefficients[i] + ",");
//		}
//		System.out.println("\n" + p.evaluate(2));
//	}
}



/*

1x^2 + 3x + 1 = y, where x = 2

4 + 6 + 1 = 11

*/