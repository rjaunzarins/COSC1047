package Lab4;

public class Transport extends Vehicle {
	
	private double tonnes;
	
	/**
	 * CONSTRUCTOR
	 * @param make The Vehicles make
	 * @param model The Vehicles model
	 * @param tonnes The weight Transport can carry
	 */
	public Transport(String make, String model, double tonnes) {
		super(make, model);
		this.tonnes = tonnes;
	}
	
	/**
	 * Copy Constructor - Copies a Transport object
	 * @param t The Transport object to copy
	 */
	public Transport(Transport t) {
		super(t.getMake(), t.getModel());
		this.tonnes = t.tonnes;
	}
	
	/**
	 * setTonnes Method
	 * @param tonnes The weight it can carry
	 */
	public void setTonnes(double tonnes) {
		this.tonnes = tonnes;
	}
	
	/**
	 * getTonnes Method
	 * @return The value in the tonnes field
	 */
	public double getTonnes() {
		return this.tonnes;
	}
	
	/**
	 * equals Method
	 * @param t A Transport object
	 * @return If the two transports are equal
	 */
	public boolean equals(Transport t) {
		return super.equals( t ) && this.tonnes == t.tonnes;
	}
	
	/**
	 * toString Method
	 * Concatenates Vehicles toString with Weight capacity
	 */
	@Override
	public String toString() {
		return super.toString() + "\nWeight Capacity: " + tonnes + " tonnes";
	}

}
