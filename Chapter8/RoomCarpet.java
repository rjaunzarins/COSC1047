package Chapter8;

public class RoomCarpet {

	private RoomDimension size;
	private double carpetCost;
	
	/**
	 * No-Arg Constructor
	 */
	public RoomCarpet() {
		
		this.size = new RoomDimension();
		this.carpetCost = 0;
	}
	/**
	 * Constructor
	 * @param size The Room's Dimensions
	 * @param carpetCost The cost of the carpet per sq. ft
	 */
	public RoomCarpet(RoomDimension size, double carpetCost) {
	
		this.size = new RoomDimension(size);
		this.carpetCost = carpetCost;
	}
	
	/**
	 * Copy Constructor
	 * @param roomCarpet The object to copy
	 */
	public RoomCarpet(RoomCarpet roomCarpet) {
		
		this.size = roomCarpet.size;
		this.carpetCost = roomCarpet.carpetCost;
	}
	
	public double getTotalCost() {
		
		return size.getArea() * carpetCost;
	}
	
	public String toString() {
		
		return String.format("Cost/sq. Ft: $%9.2f \nTotal Cost:  $%9.2f", carpetCost, getTotalCost());
	}
}
