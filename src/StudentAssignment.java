//	Author(s):			Richard Ceus
//	Date Modified:		4/10/12
//	Filename:			StudentAssignment.java

import java.util.*;

public class StudentAssignment extends Assignment
{

	private double score, grade;
	
	public StudentAssignment(String date, int number) 
	{
		super(date, number);
		grade = 0.0;
	}
	
	public StudentAssignment(Assignment asst){
		super(asst);
	}
	
	public double getScore()
	{
		calculateScore();
		return score;
	}
	
	public double getGrade(){
		if (questionList.size()>0)
			return (getScore()/questionList.size())*100.0;
		else
			return 0.0;
	}
	
	public void calculateScore()
	{
		int correct = 0;
		for(int count = 0; count < questionList.size(); count++)
		{
			if (questionList.get(count).compareAnswers())
			{
				correct++;				
			}
		}		
		score = correct;
	}
	
}
