//	Author(s):			Richard Ceus
//	Date Modified:		4/10/12
//	Filename:			StudentAssignment.java

import java.util.*;

public class StudentAssignment extends Assignment
{

	private double grade;
	
	public StudentAssignment(Calendar date, int number) 
	{
		super(date, number);
		grade = 0.0;
	}
	
	public StudentAssignment(Assignment asst){
		super(asst);
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
