package Assignment1;

/**
 * Polynomial Class 
 * Assignment 1 - COSC1047
 * @author Rhy Jaunzarins
 * Student Number: 0404377
 *
 */

public class Polynomial {

	private int degree;
	private double[] coefficients;
	
	public Polynomial(int degree) {
		this.degree = degree;
		this.coefficients = new double[degree];
	}
	
	public Polynomial(Polynomial p) {
		this.degree = p.degree;
		this.coefficients = p.coefficients;
	}
	
	public void setCoefficient(int index, double value) {
		this.coefficients[index] = value;
	}
	
	public double getCoefficient(int index) {
		return coefficients[index];
	}
	
	public int getDegree() {
		return degree;
	}
	
	public double evaluate(double x) {
		
		// First number has no exponent, set as initial value
		double value = coefficients[0];
		
		// Add each element to value after calculating
		for( int i = 1; i < coefficients.length; i++) {
			value += (coefficients[i] * ( Math.pow(x, i) ) );
		}
		return value;
	}
	
	public boolean equals(Polynomial p) {
		
		if (this.degree == p.degree) {
			for(int i = 0; i < coefficients.length; i++) {
				if(this.coefficients[i] != p.getCoefficient(i))
					return false;
			}
		}
		return true;
	}

	public String toString() {
		String poly = String.valueOf(coefficients[0]);
		for(int i = 1; i < coefficients.length; i++ ) {
			if(coefficients[i] != 0)
				poly += (" + (" + coefficients[i] + ")x^" + i );
		}
		return poly;
	}
}
