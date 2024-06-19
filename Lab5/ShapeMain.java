package Lab5;

public class ShapeMain {

	public static void main(String[] args) {
		
		Object s1 = new Square( 10.0 );
		Object s2 = new Square( 10.0 );
		Object s3 = new Square( 15.0 );
		
		if(s1 instanceof Square) {
			System.out.println( "---- Square 1 ----");
			System.out.println( "Length: " + ((Square)s1).getLength() );
			System.out.println( "Width: " + ((Square)s1).getWidth() );
			System.out.println( "Equals s2: " + s1.equals( s2 ));
			System.out.println( "Equals s3: " + s1.equals( s3 ));
			System.out.println( "Area: " + ((Square)s1).getArea());
			
		}
		
		if(s2 instanceof Square) {
			System.out.println( "\n---- Square 2 ----");
			System.out.println( "Length: " + ((Square)s2).getLength() );
			System.out.println( "Width: " + ((Square)s2).getWidth() );
			System.out.println( "Equals s1: " + s2.equals( s1 ));
			System.out.println( "Equals s3: " + s2.equals( s3 ));
			System.out.println( "Area: " + ((Square)s2).getArea());
		}
		
		if(s3 instanceof Square) {
			System.out.println( "\n---- Square 3 ----");
			System.out.println( "Length: " + ((Square)s3).getLength() );
			System.out.println( "Width: " + ((Square)s3).getWidth() );
			System.out.println( "Equals s1: " + s3.equals( s1 ));
			System.out.println( "Equals s2: " + s3.equals( s2 ));
			System.out.println( "Area: " + ((Square)s3).getArea());
		}
		
		// Rectangle
		Object r1 = new Rectangle( 10.0, 12.0 );
		Object r2 = new Rectangle( 10.0, 12.0 );
		Object r3 = new Rectangle( 15.0, 11.0 );
		
		if(r1 instanceof Rectangle) {
			System.out.println( "\n---- Rectangle 1 ----");
			System.out.println( "Length: " + ((Rectangle)r1).getLength() );
			System.out.println( "Width: " + ((Rectangle)r1).getWidth() );
			System.out.println( "Equals r1: " + r1.equals( r2 ));
			System.out.println( "Equals r2: " + r1.equals( r3 ));
			System.out.println( "Area: " + ((Rectangle)r1).getArea());
		}
		
		if(r2 instanceof Rectangle) {
			System.out.println( "\n---- Rectangle 2 ----");
			System.out.println( "Length: " + ((Rectangle)r2).getLength() );
			System.out.println( "Width: " + ((Rectangle)r2).getWidth() );
			System.out.println( "Equals r1: " + r2.equals( r1 ));
			System.out.println( "Equals r2: " + r2.equals( r3 ));
			System.out.println( "Area: " + ((Rectangle)r2).getArea());
		}
		
		if(r3 instanceof Rectangle) {
			System.out.println( "\n---- Rectangle 3 ----");
			System.out.println( "Length: " + ((Rectangle)r3).getLength() );
			System.out.println( "Width: " + ((Rectangle)r3).getWidth() );
			System.out.println( "Equals r1: " + r3.equals( r1 ));
			System.out.println( "Equals r2: " + r3.equals( r2 ));
			System.out.println( "Area: " + ((Rectangle)r3).getArea());
		}
		
		// Triangle
		Object t1 = new Triangle( 10.0, 12.0 );
		Object t2 = new Triangle( 10.0, 12.0 );
		Object t3 = new Triangle( 15.0, 11.0 );
		
		if(t1 instanceof Triangle) {
			System.out.println( "\n---- Triangle 1 ----");
			System.out.println( "Base: " + ((Triangle)t1).getBase() );
			System.out.println( "Height: " + ((Triangle)t1).getHeight() );
			System.out.println( "Equals t2: " + t1.equals( t2 ));
			System.out.println( "Equals t3: " + t1.equals( t3 ));
			System.out.println( "Area: " + ((Triangle)t1).getArea());
		}
		
		if(t2 instanceof Triangle) {
			System.out.println( "\n---- Triangle 2 ----");
			System.out.println( "Base: " + ((Triangle)t2).getBase() );
			System.out.println( "Height: " + ((Triangle)t2).getHeight() );
			System.out.println( "Equals t1: " + t2.equals( t1 ));
			System.out.println( "Equals t3: " + t2.equals( t3 ));
			System.out.println( "Area: " + ((Triangle)t2).getArea());
		}
		
		if(t3 instanceof Triangle) {
			System.out.println( "\n---- Triangle 3 ----");
			System.out.println( "Base: " + ((Triangle)t3).getBase() );
			System.out.println( "Height: " + ((Triangle)t3).getHeight() );
			System.out.println( "Equals t1: " + t3.equals( t1 ));
			System.out.println( "Equals t2: " + t3.equals( t2 ));
			System.out.println( "Area: " + ((Triangle)t3).getArea());
		}
		
		
	}
}
