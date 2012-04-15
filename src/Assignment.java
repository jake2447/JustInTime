//	Author(s):			Richard Ceus
//	Date Modified:		4/10/12
//	Filename:			Assignment.java

import java.util.ArrayList;
import java.util.Calendar;
import java.io.Serializable;
import java.text.SimpleDateFormat;


public class Assignment implements Serializable
{
	
	public ArrayList<Question> questionList;
	private int assignmentNumber;
	private Calendar dueDate;
	
	public Assignment(Calendar date, int number)
	{
		dueDate = date;
		assignmentNumber = number;
	}
	
	public Assignment(Assignment asst){
		questionList = asst.questionList;
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
	
	public void setDueDate(Calendar dueDate) 
	{
		this.dueDate = dueDate;
	}
	
	public static Calendar getDueDate() 
	{
		parseDate(dueDate);
		return dueDate;
	}
	
	public static void parseDate(Date date) 
	{
	      String ds = date;
	      DateFormat df = DateFormat.getDateInstance();
	      try 
	      {
	         Date d = df.parse(ds);
	      }
	      catch(ParseException e) 
	      {
	         System.out.println("Unable to parse " + ds);
	      }
	 }

}
