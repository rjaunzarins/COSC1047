package Review;

public class Assignment1Q1 {

	public static void main(String[] args) {
		Polynomial p = new Polynomial(4);
		p.setCoefficient(0,7);
		p.setCoefficient(1,2);
		p.setCoefficient(2,5);
		p.setCoefficient(3,0);
		p.setCoefficient(4,1);
		System.out.println("x = 3: " + p.evaluate(3));
		System.out.println("x = -3.1: " + p.evaluate(-3.1));
		System.out.println("x = 9.26: " + p.evaluate(9.26));
		
		Polynomial p2 = new Polynomial(p);
		System.out.println(p.equals(p2));
		System.out.println(p2.equals(p));
		
		Polynomial p3 = new Polynomial(3);
		p3.setCoefficient(0,7);
		p3.setCoefficient(1,2);
		p3.setCoefficient(2,5);
		p3.setCoefficient(3,0);
		
		Polynomial p4 = new Polynomial(6);
		p4.setCoefficient(0,2);
		p4.setCoefficient(1,5);
		p4.setCoefficient(2,2);
		p4.setCoefficient(3,8);
		p4.setCoefficient(4,2);
		p4.setCoefficient(5,8);
		p4.setCoefficient(6,6);
		
		System.out.println(p.equals(p3));
		System.out.println(p.equals(p4));
		
		System.out.println(p2.evaluate(3));
		System.out.println(p3.evaluate(3));
		System.out.println(p4.evaluate(3));
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
