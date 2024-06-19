package Lab5;

public class Rectangle implements Shape2D {
	
	private double length;
	private double width;
	
	/**
	 * CONSTRUCTOR
	 * @param length The Rectangle's length
	 * @param width The Rectangle's width
	 */
	public Rectangle( double length, double width ) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 * COPY CONSTRUCTOR
	 * @param r The Rectangle to copy
	 */
	public Rectangle( Rectangle r ) {
		this.length = r.length;
		this.width = r.width;
	}
	
	/**
	 * setLength Method
	 * @param length The Rectangle's length
	 */
	public void setLength( double length ) {
		this.length = length;
	}
	
	/**
	 * setWidth Method
	 * @param width The Rectangle's width
	 */
	public void setWidth( double width ) {
		this.width = width;
	}
	
	/**
	 * getLength Method
	 * @return The Rectangle's length
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * getWidth Method
	 * @return The Rectangle's width
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * getArea Method - from Shape2D interface
	 * @return The area
	 */
	@Override
	public double getArea() {
		return length * width;
	}
	
	/**
	 * equals Method
	 * @param r The Rectangle to compare
	 * @return If the two Rectangle are equals
	 */
	public boolean equals( Rectangle r ) {
		
		// If objects reference same location
		if(this == r)
			return true;
		
		// If fields match
		if( this.length == r.length ) {
			if( this.width == r.width )
				return true;
		}
		return false;
	}
	
	/**
	 * equals Method
	 * @param o The Object to compare
	 * @return If the two Objects are equal
	 */
	@Override
	public boolean equals( Object o ) {
		
		// If they reference the same location
		if( o == this )
			return true;
		
		// If instance of Rectangle, cast Object 
		// as Rectangle and check fields equal
		if( o instanceof Rectangle ) {
			Rectangle o2 = (Rectangle)o;
			if( this.length == o2.length  ) {
				if( this.width == o2.width )
					return true;
			}
		}
		return false;
	}
}

