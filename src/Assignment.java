import java.util.ArrayList;
import java.util.Calendar;
import java.io.Serializable;
import java.text.SimpleDateFormat;


public class Assignment implements Serializable
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
