//	Author(s):			Jakob Olandt
//	Date Modified:		4/1/12
//	Filename:			Question.java

import java.util.*;

public class Question {
	
	//this array will hold strings which correspond to the texts of each answer
	private ArrayList<String> answerTexts = new ArrayList<String>();
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
	
	public Question(String newBody, ArrayList<String> newAnswers, int newCorrectAnswer){
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
	
	//--------------------------------------------------------------------------------------------
	// 										access methods
	//--------------------------------------------------------------------------------------------
	
	
	//this method returns a new list that is a copy of the current answerTexts array
	public ArrayList<String> getAnswerText(){
		ArrayList<String> listCopy = new ArrayList<String>();
		for (int i = 0; i < answerTexts.size(); i++){
			listCopy.set(i, answerTexts.get(i));
		}
		return listCopy;
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
	
	
	//this method will take an ArrayList<String> as a parameter and set the answerTexts strings appropriately
	public void setAnswerText(ArrayList<String> newAnswerTexts){
		for (int i = 0; i < newAnswerTexts.size(); i++){
			answerTexts.set(i, newAnswerTexts.get(i));
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
	
}
