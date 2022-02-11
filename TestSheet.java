//Each test will be its own object and will facilitate its own logic
public class TestSheet {
    private String[] questions;
    private int[] answers;
    private int currentIndex = 0;
   
    //Pass in an array of questions, answers, and a two dimensional array for the options
     public TestSheet(String[] questions, int[] answers, String[][] options) {
        this.questions = questions;
        this.answers = answers;
    }
   
    //Get the question based of index from argument
    public String getQuestion(int index) {
        return this.questions[index];
    }
 
    //Determine whether or not a choice is correct.
    /**
    * @param: question: the index of the question to grade
    * @param: choice: the index of the choice to grade
     */
    public Boolean gradeQuestion(int question, int choice) {
        return this.answers[question] == choice;
    }
}
