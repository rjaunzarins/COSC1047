package Assignment2;

public class Vehicle {

	private String make;
	private int year;
	
	/**
	 * No-Arg Constructor
	 */
	public Vehicle() {
		this.make = "";
		this.year = 1900;
	}
	
	/**
	 * Constructor
	 * @param make The Vehicle's make
	 * @param year The Vehicle's year
	 */
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	/**
	 * setMake Method
	 * @param make The Vehicle's make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * setYear Method
	 * @param year The Vehilce's year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * getMake Method
	 * @return The Vehicle's make
	 */
	public String getMake() {
		return this.make;
	}
	
	/**
	 * getYear Method
	 * @return The Vehilce's year
	 */
	public int getYear() {
		return this.year;
	}
	
	/**
	 * equals Method
	 * @param v A Vehicle object
	 * @return Whether the two vehicles have the same name and year
	 */
	public boolean equals(Vehicle v) {
		if(this.make.equalsIgnoreCase(v.make)) {
			if(this.year == v.year)
				return true;
		}
		return false;
	}
	
	/**
	 * toString Method
	 */
	public String toString() {
		return "Make: " + this.make + "\nYear: " + this.year;
	}
}
