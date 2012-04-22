import java.util.Calendar;


public class TestStudent {
	
	public static void main (String args[]){
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		Student stud = new Student("s1", "pass");
		StudentAssignment sa1 = new StudentAssignment("a1", "07/28/1992 11:11", 1);
		StudentAssignment sa2 = new StudentAssignment("a2", "07/29/1992 11:11", 1);
		StudentAssignment sa3 = new StudentAssignment("a3", "07/29/2013 11:11", 1);
		
		System.out.println(sa1.getName());
		System.out.println(sa1.toString());
		
		
		Question q = new Question();
		q.setQuestionBody("blah");
		sa1.addQuestion(q);
		
		stud.addAssignment(sa1);
		stud.addAssignment(sa2);
		stud.addAssignment(sa3);
		
		System.out.println(stud.getAList());
		
		studentUI sUI = new studentUI(stud);
		sUI.setVisible(true);
	}

}
