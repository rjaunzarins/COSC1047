package Lab5;

public class Triangle implements Shape2D {
	
	private double base;
	private double height;
	
	/**
	 * CONSTRUCTOR
	 * @param width The Triangle's height
	 * @param base The Triangle's base
	 */
	public Triangle( double base, double height ) {
		this.base = base;
		this.height = height;
	}
	
	/**
	 * COPY CONSTRUCTOR
	 * @param t The Triangle to copy
	 */
	public Triangle( Triangle t ) {
		this.base = t.base;
		this.height = t.height;
	}
	
	/**
	 * COPY CONSTRUCTOR - OBJECT
	 * @param o The Object to copy
	 */
	public Triangle( Object o ) {
		if(o instanceof Triangle) {
			Triangle o2 = (Triangle)o;
			this.base = o2.base;
			this.height = o2.height;
		}
	}
	/**
	 * setBase Method
	 * @param base The base to set
	 */
	public void setBase( double base ) {
		this.base = base;
	}
	
	/**
	 * setHeight Method
	 * @param height The height to set
	 */
	public void setHeight( double height ) {
		this.height = height;
	}
	
	/**
	 * getBase Method
	 * @return The Triangle's base
	 */
	public double getBase() {
		return this.base;
	}
	
	/**
	 * getHeight Method
	 * @return The Triangle's height
	 */
	public double getHeight() {
		return this.height;
	}
	
	/**
	 * getArea Method - from Shape2D interface
	 * @return The Triangle's area
	 */
	@Override
	public double getArea() {
		return (base * height ) / 2;
	}
	
	/**
	 * equals Method
	 * @param t The Triangle to compare
	 * @return If the two Triangles are equal
	 */
	public boolean equals( Triangle t ) {
		
		// If they reference same location
		if(this == t)
			return true;
		// If the fields match
		if(this.base == t.base) {
			if(this.height == t.height)
				return true;
		}
		return false;
	}
	/**
	 * equals Method
	 * @param o The object to compare
	 * @return If the objects are equal
	 */
	@Override
	public boolean equals( Object o ) {
		
		// If memory addresses match they are equal
		if(this == o)
			return true;
		
		// If instance of Triangle, cast Object 
		// as Triangle and check if fields are equal
		if(o instanceof Triangle) {
			Triangle o2 = (Triangle)o;
			if(this.height == o2.height) {
				if(this.base == o2.base)
					return true;
			}
		}
		return false;
	}
}
