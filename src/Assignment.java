//	Author(s):			Richard Ceus
//	Date Modified:		4/10/12
//	Filename:			Assignment.java

import java.util.*;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Assignment implements Serializable
{
	
	public Vector<Question> questionList;
	private String assignmentName, tstamp;
	private Calendar dueDate;
	
	public Assignment(String aName, String GUIdate)
	{
		assignmentName = aName;
		dueDate = new GregorianCalendar();
		parseDateFromGUI(GUIdate);
		Calendar cal = Calendar.getInstance();
		tstamp = cal.getTime().toString();
		questionList = new Vector<Question>();
	}
	
	public Assignment(Assignment asst)
	{
		questionList = asst.getQuestionList();
		assignmentName = asst.getName();
		tstamp = asst.getTStamp();
		dueDate = asst.getDueDate();
	}
		
	public String getTStamp()
	{
		return tstamp;
	}
	
	public Vector<Question> getQuestionList()
	{
		return questionList;
	}
	
	public void setQuestionList(Vector<Question> qlist){
		questionList = qlist;
	}
	
	public void setDueDate(Calendar dueDate) 
	{
		this.dueDate = dueDate;
	}
	
	public Calendar getDueDate()
	{
		Calendar newCal = new GregorianCalendar();
		newCal.setTime(dueDate.getTime());
		return newCal;
	}
	
	public String getDueDateAsString()
	{
		return dueDate.getTime().toString();
	}
	
	
	public void parseDateFromGUI(String GUIdate) 
	{
		DateFormat formatter;
		Date date;
		
		formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		
		try {
			date = (Date)formatter.parse(GUIdate);
			dueDate.setTime(date);
		} catch (ParseException e) {
			System.out.println("Enter a valid date.");
		}
				
	}
	
	public String toString (){
		return assignmentName + " Due on: " + getDueDateAsString();
	}
	
	public String getName (){
		return assignmentName;
	}

	public void addQuestion(Question q){
		questionList.add(q);
	}

	public void deleteQuestion(Question question) {
		questionList.remove(question);
	}
	
	public Vector<Integer> getCorrect() // list of correct answer indexes
	{
		Vector<Integer> r = new Vector<Integer>();
		for(int i =0; i < questionList.size()-1; i++) // size starts with 1
		{
			int x  = questionList.get(i).getCorrectAnswer();
			r.add(x);
		}	
		return r;
	}
}

