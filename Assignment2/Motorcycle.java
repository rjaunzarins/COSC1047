package Assignment2;

public class Motorcycle extends Vehicle{

	private boolean sideCar;
	
	/**
	 * No-Arg Constructor
	 */
	public Motorcycle() {
		super();
		this.sideCar = false;
	}
	
	/**
	 * Constructor
	 * @param make The Motorcycles make
	 * @param year The Motorcycles year
	 * @param sideCar If there is a sidecar
	 */
	public Motorcycle(String make, int year, boolean sideCar) {
		super(make, year);
		this.sideCar = sideCar;
	}
	
	/**
	 * setSideCar Method
	 * @param sideCar If there is a sidecar
	 */
	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}
	
	/**
	 * getSideCar Method
	 * @return If there is a sidecar
	 */
	public boolean getSideCar() {
		return this.sideCar;
	}
	
	/**
	 * toString Method
	 */
	@Override
	public String toString() {
		return super.toString() + "\nSideCar: " + sideCar;
	}
}
