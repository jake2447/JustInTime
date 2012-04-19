import java.util.ArrayList;


public class Test {
	
	public static void main(String args[]){
		
		ArrayList<String> answersq1 = new ArrayList<String>();
		answersq1.add("0");
		answersq1.add("1");
		answersq1.add("2");
		answersq1.add("3");
		Question q1 = new Question("how many?", answersq1, 2);
		
		ArrayList<String> answersq2 = new ArrayList<String>();
		answersq2.add("0");
		answersq2.add("1");
		answersq2.add("2");
		answersq2.add("3");
		Question q2 = new Question("how many?", answersq2, 2);
		
		q1.setSelectedAnswer(1);
		q2.setSelectedAnswer(2);
		
		System.out.println(q1.compareAnswers());
		System.out.println(q2.compareAnswers());
		
		ArrayList<Question> qlist = new ArrayList<Question>();
		qlist.add(q1);
		qlist.add(q2);
		
		Assignment a1 = new Assignment("14/04/12", 5);
		a1.setQuestionList(qlist);
		
		StudentAssignment sa1 = new StudentAssignment(a1);
		
		System.out.println(sa1.getQuestionList().get(0).compareAnswers());
		System.out.println(sa1.getQuestionList().get(1).compareAnswers());
		System.out.println(sa1.getScore());
		System.out.println(sa1.getGrade());
	}

}
