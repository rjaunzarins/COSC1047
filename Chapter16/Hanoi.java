package Chapter16;

public class Hanoi {

	private int numDiscs;		
	
	public Hanoi( int n ) {
		// Assign the number of discs
		numDiscs = n;
		
		//Move the number of discs from peg 1 to peg 3 using peg 2 as temp
		moveDiscs(numDiscs, 1, 3, 2);
	}
	
	private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
		if(num>0) {
			moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
			System.out.println("Move a disc from peg " + fromPeg +	" to peg " + toPeg );
			moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
		}
	}
	public static void main(String[] args) {
		
		new Hanoi(3);
	}

}
