public class Tests {
		public static void main(String[] args){
			String[] questions = new String[2];
			int[] answers = new int[2];
			String[][] options = new String[2][2];
			questions[0] = "question 01";
			questions[1] = "question 02";
			answers[0] = 1;
			answers[1] = 0;
            String correct = "=";
			String incorrect = "!=";
			String resultOp = "!=";
			
			//Initing test
			TestSheet testTest = new TestSheet(questions, answers, options);
			
			// Running tests on test
			System.out.println("Checking if test object outputs correctly");
			System.out.println("To pass, the following must be true");
			System.out.println("testTest.getQuestion(0) should equal \"question 01\"");
			if(testTest.getQuestion(0) == "question 01") resultOp = correct;
			else resultOp = incorrect;
			System.out.println(testTest.getQuestion(0) + " " + resultOp + " question 01");
			
			System.out.println("");
			
			System.out.println("Checking Grading function 01");
			System.out.println("To pass the following must be true");
			System.out.println("testTest.gradeQuestion(0, 1) should equal true");
			if(testTest.gradeQuestion(0, 1) == true) resultOp = correct;
			else resultOp = incorrect;
			System.out.println(testTest.gradeQuestion(0, 1) + " " + resultOp + " true");

			System.out.println();
			
			System.out.println("Checking Grading function 02");
			System.out.println("To pass the following must be true");
			System.out.println("testTest.gradeQuestion(0, 0) should equal false");
			if(testTest.gradeQuestion(0, 0) == false) resultOp = correct;
			else resultOp = incorrect;
			System.out.println(testTest.gradeQuestion(0, 0) + " " + resultOp + " false");	
		}
}
