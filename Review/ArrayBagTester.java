package Review;

import Generics.ArrayBag;

public class ArrayBagTester {

	public static void main(String[] args) {
		
		ArrayBag<Die> bag = new ArrayBag<Die>(0);
		bag.add(new Die(6));
		bag.add(new Die(10));
		bag.add(new Die(50));
		
		bag.grab().roll();
	}
}
