import java.util.Calendar;
import java.util.Date;


public class StudentAssignment extends Assignment
{

	private int grade;
	
	public StudentAssignment(Calendar date, int number) 
	{
		super(date, number);
	}
	
	public double getGrade()
	{
		return grade;
	}
	
	public void calculateGrade()
	{
		int correct;
		int total;
		
		for(int count = 0; count > questionList.size(); count++)
		{
			
		}
	}
	
}
