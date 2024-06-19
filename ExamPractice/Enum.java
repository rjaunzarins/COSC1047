package ExamPractice;

public class Enum {

	public static void main(String[] args) {

		enum Level { LOW, MED, HIG }
		Level myLev = Level.MED;
		
		switch(myLev) {
		case LOW:
			System.out.println("Low");
			break;
		case MED:
			System.out.println("Medium");
			break;
		case HIG:
			System.out.println("High");
			break;
		}
	}

}
