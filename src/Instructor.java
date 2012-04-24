//this class represents an Instructor account
import java.util.*;

public class Instructor extends User{
    private Vector<Student> studentList;  //the list of students in the instructors class
    private Vector<Assignment> instrAssignmentList;  //the list of assignments the instructor has created

    public Instructor(String username, String password){
    	super(username, password);		//use the User constructor
    	studentList = new Vector();
    	instrAssignmentList = new Vector();
    	TYPE = 1;
    }

    //adds an assignment to the list of assignments
    public void createAssn(int x, Assignment asst){
    	instrAssignmentList.add(x, asst);
    }

    //adds a question to the specified assignment in the assignment list
    public void addQuestion(int x, Question ques, Assignment asst){
    	asst.questionList.add(x, ques);
    }
    
    //adds an existing student to the list of students in the instr's class
    public void addStudent(Student stud){
    	studentList.add(stud);
    }

    //removes a question from the specified index in the specified assignment
    public void removeQuestion(int x, Assignment asst){
    	asst.questionList.remove(x);
    }

    //replaces an existing question in the specified assignment with the new question
    public void editQuestion(int x, Question editedQues, Assignment asst){
    	asst.questionList.set(x, editedQues);
    }
    
    //returns a reference to the instr's assignment list
    public Vector<Assignment> getAList(){
    	return instrAssignmentList;
    }
    
    //adds a NEW assignment to the instructors assignment list by providing a name and due date
    public void addAssignment(String name, String date){
    	instrAssignmentList.add(new Assignment(name,date));
    }
    
    //removes an assignment from the assignment list
    public void deleteAssignment(Assignment asst){
    	instrAssignmentList.remove(asst);
    }

    //returns the average score for an assignment
    //is not used
    public double getAssignmentAverage(Assignment assn){
    	String tstamp = assn.getTStamp();
    	double avg = 0;
    	for (int i = 0; i < studentList.size(); i++){
    		StudentAssignment temp = studentList.get(i).findAssignemnt(tstamp);
    		avg += temp.getGrade();
    	}
    	if (studentList.size()!=0)
    		return avg / studentList.size();
    	else
    		return 0.0;
    }

    //submits an assignment to all students by creating a new Student Assignment object for each
    //this causes some problems if the instr tries to edit/delete the assignment after assigning in
    //
    public void assign(Assignment asst){
        for(int count=0; count < studentList.size(); count++){
        	studentList.get(count).addAssignment(asst);
        }
    }
    
    //returns a reference to the student list
    public Vector<Student> getSList(){
    	return studentList;
    }
   
    //calculates the percentage of students that correctly responded to a question at the specified position
    //in the specified assignments question list
    public double getQuestionAverageCorrect(int index, Assignment asst)
    {
    	double grade = 0;
    	int count = 0;
    	for (int i = 0; i < studentList.size(); i++){
    		StudentAssignment temp = studentList.get(i).findAssignemnt(asst.getTStamp());
    		Question tempQ = temp.getQuestionList().get(index);
    		if (tempQ.compareAnswers()){
    			grade++;
    		}
    		count++;
    	}
    	if (count != 0)
    		return (grade/count) * 100;
    	else
    		return 0.0;
    }
    
    //returns a vector that calculates the percentage of respondents to the specified question
    //that chose each answer
    public Vector<Double> getQuestionBreakdown(int index, Assignment asst){
    	Vector<Double> v = new Vector<Double>();
    	double a0,a1,a2,a3;
    	a0=a1=a2=a3=0;
    	
    	for (int i = 0; i < studentList.size(); i++){
    		StudentAssignment temp = studentList.get(i).findAssignemnt(asst.getTStamp());
    		Question tempQ = temp.getQuestionList().get(index);
    		
    		if (tempQ.getSelectedAnswer()==0)
    			a0++;
    		else if (tempQ.getSelectedAnswer()==1)
    			a1++;
    		else if (tempQ.getSelectedAnswer()==2)
    			a2++;
    		else if (tempQ.getSelectedAnswer()==3)
    			a3++;
    		
    	}
    	
    	if (studentList.size()!=0){
    		a0/=studentList.size();
    		a1/=studentList.size();
    		a2/=studentList.size();
    		a3/=studentList.size();
    	}
    	
    	v.add(a0);
    	v.add(a1);
    	v.add(a2);
    	v.add(a3);
    	return v;
    }
}
