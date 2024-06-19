package PreLab4;

public class Car extends Vehicle {

	private int numDoors;
	
	/**
	 * CONSTRUCTOR
	 * @param make The Vehicle's make
	 * @param model The Vehicle's model
	 * @param numDoors The number of doors
	 */
	public Car(String make, String model, int numDoors) {
		
		super(make, model);
		this.numDoors = numDoors;
	}
	
	/**
	 * Copy Constructor - Copies a Car object
	 * @param c The Car object to copy
	 */
	public Car(Car c) {
		super(c.getMake(), c.getModel());
		this.numDoors = c.numDoors;
	}
	
	/**
	 * setNumDoors Method - Sets the number of doors
	 * @param numDoors The number of doors
	 */
	public void setNumDoors(int numDoors) {
		
		this.numDoors = numDoors;
	}
	
	/**
	 * getNumDoors Method - Gets the number of doors
	 * @return The number of doors
	 */
	public int getNumDoors() {
		
		return numDoors;
	}
	
	/**
	 * equals Method - Compares two Car objects
	 * @param c The Car to compare
	 * @return If the are equal
	 */
	public boolean equals(Car c) {
		if(getMake().equals(c.getMake())) {
			if(getModel().equals(c.getModel())) {
				if(this.numDoors == c.numDoors)
					return true;
			}
		}
		return false;
	}
	
	/**
	 * toString Method
	 * @return The Car attributes
	 */
	@Override
	public String toString() {
		
		return super.toString() + "\nNumber of doors: " + numDoors;
		
	}
}
