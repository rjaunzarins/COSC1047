package Review;

public class FillInTheBlank {
	
	private String question;
	private String answer;
	
	public FillInTheBlank() {
		question = "";
		answer = "";
	}
	
	public FillInTheBlank(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public boolean checkAnswer(String response) {
		return answer.equalsIgnoreCase(response);
	}
	
}