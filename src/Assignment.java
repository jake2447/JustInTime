//	Author(s):			Richard Ceus
//	Date Modified:		4/10/12
//	Filename:			Assignment.java

import java.util.*;


public class Assignment 
{
	
	public ArrayList<Question> questionList;
	private int assignmentNumber;
	private static Calendar dueDate;
	
	public Assignment(Calendar date, int number)
	{
		dueDate = date;
		assignmentNumber = number;
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
		return dueDate;
	}

}
