package Chapter8;

public class Area {

	/**
	 * area Method - returns the area of a circle
	 * @param radius The circles radius
	 * @return The circles area
	 */
	public static double area(Double radius) {
		
		return (Math.PI * Math.pow(radius, 2));
	}
	
	/**
	 * area Method - returns the area of a rectangle
	 * @param length The length of the rectangle
	 * @param width The width of the rectangle
	 * @return The area of the rectangle
	 */
	public static double area(int length, int width) {
		
		return length * width;
	}
	
	/**
	 * area Method - return the area of a cylinder
	 * @param radius The cyclinder's base radius
	 * @param height The cylinder's height
	 * @return The area of the cylinder
	 */
	public static double area(double radius, double height) {
		
		return Math.PI * height * Math.pow(radius, 2);
	}
	
}
