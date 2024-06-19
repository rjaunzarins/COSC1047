package Chapter8;

public class FillInTheBlank {

	private String question;
	private String answer;
	
	public FillInTheBlank(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public FillInTheBlank(FillInTheBlank fitb) {
		this.question = fitb.question;
		this.answer = fitb.answer;
	}
}
