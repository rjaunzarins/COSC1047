package PreLab5;

public class ShapeMain {

	public static void main(String[] args) {
		
		Object r1 = new Rectangle( 5.0, 10.0 );
		Object r2 = new Rectangle( 4.0, 8.0 );
		Object r3 = new Rectangle( 4.0, 8.0 );

			
		Object t1 = new Triangle( 4.0, 8.0 );
		Object t2 = new Triangle( 6.0, 4.0 );
		Object t3 = new Triangle( t1 );
		
		System.out.println( "---- Rectangle Objects ----");
		System.out.println( "Object R1 equals Object R2: " + r1.equals( r2 ));
		System.out.println( "Object R2 equals Object R3: " + r2.equals( r3 ));
		System.out.println( "\n---- Triangle Objects ----");
		System.out.println( "Object T1 equals Object T2: " + t1.equals( t2 ));
		System.out.println( "Object T3 equals Object T1: " + t3.equals( t1 ));
		System.out.println( "Length: " + ((Rectangle)r1).getLength() + "\nWdith: " + ((Rectangle)r1).getWidth() );
	}

}
