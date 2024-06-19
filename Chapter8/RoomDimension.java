package Chapter8;

public class RoomDimension {

	private double length;
	private double width;
	
	/**
	 * No-Arg Constructor
	 */
	public RoomDimension() {
		
		this.length = 0;
		this.width = 0;
	}
	
	/**
	 * Constructor
	 * @param length The rooms length
	 * @param width The rooms width
	 */
	public RoomDimension(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Copy Constructor
	 * @param rD The RoomDimension to copy
	 */
	public RoomDimension(RoomDimension rD) {
		
		this.length = rD.length;
		this.width = rD.width;
	}
	
	/**
	 * getArea Method
	 * @return The Room's Area
	 */
	public double getArea() {
		
		return length * width;
	}
	
	/**
	 * toString Method
	 * @return The object as a String
	 */
	public String toString() {
		
		return String.format("Length: %15.2f \nWidth: %16.2f \nArea: %17.2f", 
				              length, width, getArea());
	}
}
