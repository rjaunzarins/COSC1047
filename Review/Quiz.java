package Review;

public class Quiz {
	
	private int numQuestions;
	private String title;
	private FillInTheBlank[] questions;
	
	public Quiz() {
		numQuestions = 5;
		title = "Quiz 1";
		questions = new FillInTheBlank[5];
	}
	
	public Quiz(Quiz q) {
		this.numQuestions = q.numQuestions;
		this.title = q.title;
		questions = new FillInTheBlank[q.numQuestions];
		for(int i = 0; i < questions.length; ++i) {
			questions[i].setQuestion(q.questions[i].getQuestion());
		}
	}
	
	public void setQuestion(int index, FillInTheBlank f) {
		if(!(index-1 < 0) || !(index-1 > numQuestions)) {
			question[index-1] = f.getQuestion() 
		}
	}
	
	public String getQuestion(int index) {
		if(!(index-1 < 0) || !(index-1 > numQuestions)) {
			
		}
	}
	
	public void printTest() {
		for(int i = 0; i < questions.length; ++i) {
			System.out.println(i+1 + ". " + questions[i].getQuestion());
		}
	}
	
	public void printAnswers() {
		for(int i = 0; i < questions.length; ++i) {
			System.out.println(i+1 + ". " + questions[i].getAnswer());
		}
	}
}
