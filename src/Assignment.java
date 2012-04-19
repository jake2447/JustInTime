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
	
	public ArrayList<Question> questionList;
	private int assignmentNumber;
	private String assignmentName;
	private Calendar dueDate;
	
	public Assignment(String aName, String GUIdate, int number)
	{
		assignmentName = aName;
		dueDate = parseDateFromGUI(GUIdate);
		assignmentNumber = number;
	}
	
	public Assignment(Assignment asst)
	{
		questionList = asst.getQuestionList();
		assignmentNumber = asst.getAssignmentNumber();
		dueDate = asst.getDueDate();
	}
	
	public void setAssignmentNumber(int assignmentNumber)
	{
		this.assignmentNumber = assignmentNumber;
	}
	
	public int getAssignmentNumber()
	{
		return assignmentNumber;
	}
	
	public ArrayList<Question> getQuestionList()
	{
		ArrayList<Question> qList = new ArrayList<Question>();
		for (int i = 0; i < questionList.size(); i++)
		{
			qList.add(questionList.get(i));
		}
		return qList;
	}
	
	public void setQuestionList(ArrayList<Question> qlist){
		questionList = qlist;
	}
	
	public void setDueDate(Calendar dueDate) 
	{
		this.dueDate = dueDate;
	}
	
	public Calendar getDueDate() 
	{
		return dueDate;
	}
	
	public String getDueDateAsString()
	{
		return dueDate.getTime().toString();
	}
	
	
	public Calendar parseDateFromGUI(String GUIdate) 
	{
		Calendar dDate = new GregorianCalendar();
		return dDate;
	}
	
	public String toString (){
		return assignmentName;
	}

}
