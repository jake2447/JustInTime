//	Author(s):			Richard Ceus
//	Date Modified:		4/10/12
//	Filename:			StudentAssignment.java

import java.util.*;

public class StudentAssignment extends Assignment
{

	private double score, grade;
	private int pointsPerQuestion = 1;  //multiplier for the number of points rewarded for a correct answer
	
	public StudentAssignment(String name, String date, int number) 
	{
		super(name, date, number);
		grade = 0.0;
	}
	
	public StudentAssignment(Assignment asst){
		super(asst);
	}
	
	//returns the score of the assignment after calculating it
	public double getScore()
	{
		calculateScore();
		return score;
	}
	
	//returns the grade of the assignment out of 100 percent
	public double getGrade(){
		if (questionList.size()>0)
			grade = (getScore()/questionList.size())*100.0;
		else
			grade = 0.0;
		return grade;
	}
	
	//calculates the score of the assignment as correct answers * pointsPerQuestion
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
		score = correct * pointsPerQuestion;
	}
	
}
