package ExamPractice;

public class Tube implements Package{
	private double radius;
	private double height;
	
	public Tube(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double area() {
		return (2 * Math.PI * radius * height);
	}

	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	
	public double getDiameter() {
		return radius *2;
	}
}
