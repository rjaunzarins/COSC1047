package Lab4;

public class Vehicle {

	private String make;
	private String model;
	
	/**
	 * CONSTRUCTOR
	 * @param make The Vehicle's make
	 * @param model The Vehicle's model
	 */
	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	/**
	 * COPY CONSTRUCTOR - Copies Vehicle object
	 * @param v A Vehicle object to copy
	 */
	public Vehicle(Vehicle v) {
		this.make = v.make;
		this.model = v.model;
	}
	
	/**
	 * setMake Method - Sets the Vehicle's make
	 * @param make The Vehicle's make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * setModel Method - Sets the Vehicle's model
	 * @param model The Vehicle's model
	 */
	public void setModel(String model) {
		this.model= model;
	}
	
	/**
	 * getMake Method - Gets the Vehicle's make
	 * @return The Vehicle's Make
	 */
	public String getMake() {
		return this.make;
	}
	
	/**
	 * getModel Method - Gets the Vehicle's model
	 * @return The Vehicle's model
	 */
	public String getModel() {
		return this.model;
	}
	
	/**
	 * equals Method - Compares two Vehicle objects
	 * @param v The Vehicle object to check
	 * @return If they are equal
	 */
	public boolean equals(Vehicle v) {
		return make.equalsIgnoreCase(v.make) && model.equalsIgnoreCase(v.model);
	}
	
	/**
	 * toString Method
	 * @return The Vehicle's attributes
	 */
	public String toString() {
		return "Make: " + this.make + "\n" + "Model: " + this.model;
	}
}

