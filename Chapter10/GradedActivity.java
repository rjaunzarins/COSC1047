package Chapter10;

public class GradedActivity {

	private double score;
	
	/**
	 * The setScore method sets the score field
	 * @param s The value to store in score
	 */
	public void setScore(double s) {
		score = s;
	}
	
	/**
	 * The getScore method returns the score
	 * @return The value stored in the score field
	 */
	public double getScore() {
		return score;
	}
	
	/**
	 * The getGrade method returns a letter grade 
	 * determined from the score field
	 * @return The letter grade
	 */
	public char getGrade() {
		if(score >= 90)
			return 'A';
		else if(score >= 80)
			return 'B';
		else if(score >= 70)
			return 'C';
		else if(score >= 60)
			return 'D';
		else
			return 'F';
	}
}
