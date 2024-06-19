package Chapter8;

public class Quiz {

	private FillInTheBlank[] questions;
	
	public Quiz(Quiz o) {
		questions = new FillInTheBlank[o.questions.length];
		for(int i = 0; i < questions.length; i++) {
			questions[i] = new FillInTheBlank( o.questions[i]);
		}
			
	}
}
