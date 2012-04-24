//	Author(s):			Jakob Olandt
//	Date Modified:		4/1/12
//	Filename:			Question.java

import java.io.Serializable;
import java.util.*;

public class Question implements Serializable{
	
	//this array will hold strings which correspond to the texts of each answer
	private Vector<String> answerTexts = new Vector<String>();
	private String questionBody;
	
	//these ints correspond to the correct answer and the user's selected answer
	private int correctAnswer, selectedAnswer;
	
	
	//--------------------------------------------------------------------------------------------
	// 										constructors
	//--------------------------------------------------------------------------------------------
	
	public Question(){
		questionBody = "";
		correctAnswer = 1;
		selectedAnswer = -1;
	}
	
	public Question(String newBody, Vector<String> newAnswers, int newCorrectAnswer){
		for (int i = 0; i < newAnswers.size(); i++){
			if (i < answerTexts.size()){
				answerTexts.set(i, newAnswers.get(i));
			}
			else{
				answerTexts.add(i, newAnswers.get(i));
			}			
		}		
		questionBody = newBody;
		correctAnswer = newCorrectAnswer;
		selectedAnswer = -1;		
	}
	
	public Question(Question q){
		questionBody = new String(q.getQuestionBody());
		correctAnswer = q.getCorrectAnswer();
		selectedAnswer = -1;
		answerTexts = new Vector<String>(q.getAnswerText());
	}
	
	//--------------------------------------------------------------------------------------------
	// 										access methods
	//--------------------------------------------------------------------------------------------
	
	
	//this method returns a new list that is a copy of the current answerTexts array
	public Vector<String> getAnswerText(){
		return answerTexts;
	}
	
	//returns the main text of the question body
	public String getQuestionBody(){
		return questionBody;
	}
	
	public int getSelectedAnswer(){
		return selectedAnswer;
	}
	
	public int getCorrectAnswer(){
		return correctAnswer;
	}
	
	//--------------------------------------------------------------------------------------------
	// 										modifier methods
	//--------------------------------------------------------------------------------------------
	
	
	//this method will take an Vector<String> as a parameter and set the answerTexts strings appropriately
	public void setAnswerText(Vector<String> newAnswerTexts){
		for (int i = 0; i < 4; i++){
			answerTexts.add(newAnswerTexts.get(i));
		}
	}
	
	//this method sets the main question body text
	public void setQuestionBody(String newBodyText){
		questionBody = newBodyText;
	}
	
	//this method sets the selected answer to a new answer
	public void setSelectedAnswer(int newAnswer){
		selectedAnswer = newAnswer;
	}
	
	//this methods sets the correct answer to a new answer
	public void setCorrectAnswer(int newAnswer){
		correctAnswer = newAnswer;
	}
	
	//--------------------------------------------------------------------------------------------
	// 										additional methods
	//--------------------------------------------------------------------------------------------
	
	//method that compares the selected and correct answers
	//if the answers are the same return true, otherwise return false
	public boolean compareAnswers(){
		if (correctAnswer==selectedAnswer)
			return true;
		else
			return false;
	}
	
	public String toString(){
		try{
			return questionBody.substring(0, 32);
		}
		catch (StringIndexOutOfBoundsException ex){
			return questionBody;
		}
		
	}
	
}
