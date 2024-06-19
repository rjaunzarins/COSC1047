package Review;

public class Polynomial {

	private int degree;
	private double[] arr;
	
	/**
	 * CONSTRUCTOR - initializes elements of arr to 0.0
	 * @param degree The degree of the Polynomial
	 */
	public Polynomial(int degree) {
		this.degree = degree;
		this.arr = new double[degree + 1];
	}
	
	/**
	 * COPY CONSTRUCTOR
	 * @param p The Polynomial to copy
	 */
	public Polynomial(Polynomial p) {
		this.degree = p.degree;
		this.arr = new double[degree + 1];
		for(int i = 0; i < p.arr.length; i++) {
			setCoefficient(i, p.arr[i]);
		}
	}
	
	/**
	 * setCoefficient Method
	 * @param index Index to set
	 * @param value Value of Coefficient at index
	 */
	public void setCoefficient(int index, double value) {
		this.arr[index] = value;
	}
	
	/**
	 * getCoefficient Method
	 * @param index The index to retrieve coefficient from
	 * @return The value at index
	 */
	public double getCoefficient(int index) {
		return this.arr[index];
	}
	
	/**
	 * evaluate Method
	 * @param x The value for x in Polynomial
	 * @return The result of evaluated Polynomial
	 */
	public double evaluate(double x) {
		double eval = arr[0];
		for(int i = degree; i > 0; --i) {
			eval += Math.pow(x, i) * arr[i];
		}
		return eval;
	}
	
	/**
	 * equals Method
	 * @param p The Object to check
	 * @return If the two are equal
	 */
	public boolean equals(Object p) {
		if(p instanceof Polynomial) {
			Polynomial p2 = (Polynomial)p;
			if(this.degree == p2.degree) {
				for(int i = 0; i < arr.length; ++i) {
					if(arr[i] != p2.arr[i]) {
						return false;
					}
				}
			}
			else { return false; }
		}
		else { return false; }
		
		return true;
	}
	
	public String toString() {
		String str = "Polynomial: " + arr[0];
		for(int i = 1; i < arr.length; ++i) {
			if(arr[i] != 0)
				if(i != 1)
					str += " + (" + arr[i] + ")x^" + i;
				else
					str += " + (" + arr[i] + ")x";
		}
		return str;
	}
}
