package Assignment2;

public class Wheel {
	
	private int size;
	private String type;
	
	public Wheel(int size, String type) {
		this.size = size;
		this.type = type;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		return "Wheel: " + "Size: " + size + " Type: " + type; 
	}

}
