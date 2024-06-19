package ExamPractice;

public class Trio {
	private Object one;
	private Object two;
	private Object three;
	
	public Trio(Object one, Object two, Object three) {
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	public Object getOne() {
		return one;
	}
	
	public Object getTwo() {
		return two;
	}
	
	public Object getThree() {
		return three;
	}
	
	public void setOne(Object one) {
		this.one = one;
	}
	
	public void setTwo(Object two) {
		this.two = two;
	}
	
	public void setThree(Object three) {
		this.three = three;
	}
}
