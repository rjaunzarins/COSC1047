package Assignment2;

public class Frame {
	
	private int size;
	private String colour;
	
	public Frame(int size, String colour) {
		this.size = size;
		this.colour = colour;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String toString() {
		return "Frame: " + "Size: " + size + " Colour: " + colour;
	}
}
