//	Author(s):			Richard Ceus
//	Date Modified:		4/10/12
//	Filename:			StudentAssignment.java

import java.text.DecimalFormat;
import java.util.*;

public class StudentAssignment extends Assignment
{

	private double score, grade;
	private int pointsPerQuestion = 1;  //multiplier for the number of points rewarded for a correct answer
	
	public StudentAssignment(String name, String date) 
	{
		super(name, date);
		grade = 0.0;
	}
	
	public StudentAssignment(Assignment asst){
		super(asst,1);
	}
	
	//returns the score of the assignment after calculating it
	public double getScore()
	{
		calculateScore();
		return score;
	}
	
	public double getGrade(){
		if (questionList.size()>0)
			grade = (getScore()/(questionList.size() * pointsPerQuestion))*100.0;
		else
			grade = 0.0;    	
		return grade;
	}
	
	//returns the grade of the assignment out of 100 percent
	public String getStringGrade(){
		if (questionList.size()>0)
			grade = (getScore()/(questionList.size() * pointsPerQuestion))*100.0;
		else
			grade = 0.0;
		
		DecimalFormat fmt = new DecimalFormat("###.##");
    	String output = fmt.format(grade);
    	
		return output;
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
