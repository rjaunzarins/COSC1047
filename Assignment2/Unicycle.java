package Assignment2;

public class Unicycle {
	
	public String name;
	public Frame frame;
	public Wheel wheel;
	
	public Unicycle() {
		this.name = "Rhy Jaunzarins";
	 	this.frame = new Frame(16, "Black");
	 	this.wheel = new Wheel(24, "Mountain");
	}
	
	public Unicycle(String name, Frame frame, Wheel wheel) {
		this.name = name;
		this.frame = new Frame(frame.getSize(), frame.getColour());
		this.wheel = new Wheel(wheel.getSize(), wheel.getType());
	}
	
	public Unicycle(Unicycle u) {
		this.name = u.name;
		this.frame = new Frame(u.frame.getSize(), u.frame.getColour());
		this.wheel = new Wheel(u.wheel.getSize(), u.wheel.getType());
	}
	
	public String toString() {
		return "Name: " + name + "\n" + frame.toString() + "\n" + wheel.toString();
	}
}
