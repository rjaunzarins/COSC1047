package ExamPractice;

public class test {

	public static void main(String[] args) {
		
		DynamicArry DA = new DynamicArry();
		
		ArrayBag<Integer> AB = new ArrayBag<>();
		
		TrioGeneric<Integer, Integer, Double> trio1 = new TrioGeneric<>(1,2,3.3);

	}
	
	private class DynamicArry<E> {
		E[] data;
		int numItems;
	}
	
	private class ArrayBag<E> {
		E[] data;
		int numItems;
	}

}
