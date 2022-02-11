
public class TestSheet {
	private String[] questions;
	private int[] answers;
	private int currentIndex = 0;
	
	 public TestSheet(String[] questions, int[] answers, String[][] options) {
		this.questions = questions;
		this.answers = answers;
	}
	
	public String getQuestion(int index) {
		return this.questions[index];
	}
	public Boolean gradeQuestion(int question, int choice) {
		return this.answers[question] == choice;
	}
}
