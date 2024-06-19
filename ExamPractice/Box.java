package ExamPractice;

public class Box implements Package {
	private double length;
	private double width;
	private double height;
	
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return 2 * ((length * width) + (length * height) + (width * height));
	}

	@Override
	public double volume() {
		return length * width * height;
	}

}
