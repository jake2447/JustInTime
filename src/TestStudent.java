import java.util.Calendar;
import java.util.Vector;


public class TestStudent {
	
	
	
	public static void main (String args[]){
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		Student stud = new Student("s1", "pass");
		StudentAssignment sa1 = new StudentAssignment("a1", "07/28/1992 11:11", 1);
		StudentAssignment sa2 = new StudentAssignment("a2", "07/29/1992 11:11", 1);
		StudentAssignment sa3 = new StudentAssignment("a3", "07/29/2003 11:11", 1);
		
		System.out.println(sa1.getName());
		System.out.println(sa1.toString());
		
		
		Question q1 = new Question();
		q1.setQuestionBody("blah");
		Vector<String> v1 = new Vector();
		v1.add("a");
		v1.add("b");
		v1.add("c");
		v1.add("d");
		q1.setAnswerText(v1);
		q1.setCorrectAnswer(2);
		q1.setSelectedAnswer(2);
		sa3.addQuestion(q1);
		
		Question q2 = new Question();
		q2.setQuestionBody("blah2");
		Vector<String> v2 = new Vector();
		v2.add("a");
		v2.add("b");
		v2.add("c");
		v2.add("d");
		q2.setAnswerText(v2);
		q2.setCorrectAnswer(3);
		q2.setSelectedAnswer(2);
		sa3.addQuestion(q2);
		
		stud.addAssignment(sa1);
		stud.addAssignment(sa2);
		stud.addAssignment(sa3);
		
		System.out.println(stud.getAList());
		
		studentUI sUI = new studentUI(stud);
		sUI.setVisible(true);
	}

}
