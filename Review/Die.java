package Review;

public class Die {

	private int sides;
	private int face;
	
	public Die() {
		sides = 6;
		face = (int)(Math.random() * 6) + 1;
	}
	
	public Die(int sides) {
		if(sides == 4 || sides == 6 || sides == 8 || sides == 10 || sides == 12 || sides == 20 || sides == 100) {
			this.sides = sides;
			roll();
		}
		else {
			this.sides = 6;
			roll();
		}
	}
	
	public int getValue() {
		return face;
	}
	
	public void roll() {
		face = (int)(Math.random() * sides) + 1;
	}
	
	public String toString() {
		return "Die: [" + sides + " sides, value: " + face;
	}
}
