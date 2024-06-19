package Assignment2;

public class Car extends Vehicle {

	private int maxPass;
	
	/**
	 * No-Arg Constructor
	 */
	public Car() {
		super();
		this.maxPass = 1;
	}
	
	/**
	 * Constructor
	 * @param make The Car's make
	 * @param year The Car's year
	 * @param maxPass The max number of passengers
	 */
	public Car(String make, int year, int maxPass) {
		super(make, year);
		this.maxPass = maxPass;
	}
	
	/**
	 * setMaxPass Method
	 * @param maxPass The max number of passengers
	 */
	public void setMaxPass(int maxPass) {
		this.maxPass = maxPass;
	}
	
	/**
	 * getMaxPass Method
	 * @return The max number of passengers
	 */
	public int getMaxPass() {
		return this.maxPass;
	}
	
	/**
	 * toString Method
	 * @return The string representation of the Car
	 */
	@Override
	public String toString() {
		return super.toString() + "\nMax Passengers: " + this.maxPass;
	}
}
