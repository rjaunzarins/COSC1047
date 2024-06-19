package ExamPractice;

public class Object1 {
	// data1 field is static so its one value for all objects. 
	//When o2 is created the value is updated in o1 as well
	private static int data1;	
	private int data2;
	
	public Object1(int d1, int d2) {
		data1 = d1;
		data2 = d2;
	}
	
	public int getData1() {
		return data1;
	}
	
	public int getData2() {
		return data2;
	}
	
	public static void main(String[] args) {
		Object1 o1 = new Object1(5,7);
		Object1 o2 = new Object1(50,70);
		
		System.out.println(o1.getData1() + ", " + o1.getData2());
		System.out.println(o2.getData1() + ", " + o2.getData2());
	}
}
