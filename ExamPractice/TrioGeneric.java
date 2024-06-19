package ExamPractice;

public class TrioGeneric<A,B,C> {
	private A one;
	private B two;
	private C three;
	
	public TrioGeneric(A one, B two, C three) {
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	public A getOne() {
		return one;
	}
	
	public B getTwo() {
		return two;
	}
	
	public C getThree() {
		return three;
	}
	
	public void setOne(A one) {
		this.one = one;
	}
	
	public void setTwo(B two) {
		this.two = two;
	}
	
	public void setThree(C three) {
		this.three = three;
	}
	
	@Override
	public String toString() {
		return "[" + one.toString() + "," + two.toString() + "," + three.toString() + "]";
	}
	
	public static void main(String[] args) {
		TrioGeneric gen1 = new TrioGeneric<>(12, 4.5, 6);
		TrioGeneric gen2 = new TrioGeneric(3.3, 4, 5.);
		
		
		System.out.println("Gen 1: " + gen1.toString());
		System.out.println("Gen 2: " + gen2.toString());
	}
}
