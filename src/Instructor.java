import java.util.*;

public class Instructor extends User{
    private Vector<Student> studentList;
    private Vector<Assignment> instrAssignmentList;

    public Instructor(String username, String password){
    	super(username, password);
    	studentList = new Vector();
    	instrAssignmentList = new Vector();
    	TYPE = 1;
    }

    public void createAssn(int x, Assignment asst){
    	instrAssignmentList.add(x, asst);
    }

    public void addQuestion(int x, Question ques, Assignment asst){
    	asst.questionList.add(x, ques);
    }
    
    public void addStudent(Student stud){
    	studentList.add(stud);
    }

    public void removeQuestion(int x, Assignment asst){
    	asst.questionList.remove(x);
    }

    public void editQuestion(int x, Question editedQues, Assignment asst){
    	asst.questionList.set(x, editedQues);
    }
    
    public Vector<Assignment> getAList(){
    	return instrAssignmentList;
    }
    
    public void addAssignment(String name, String date){
    	instrAssignmentList.add(new Assignment(name,date));
    }
    
    public void deleteAssignment(Assignment asst){
    	instrAssignmentList.remove(asst);
    }

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

    public void assign(Assignment asst){
        for(int count=0; count < studentList.size(); count++){
        	studentList.get(count).addAssignment(asst);
        }
    }
    
    public Vector<Student> getSList(){
    	return studentList;
    }
   
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
    		return grade/count;
    	else
    		return 0.0;
    }
    
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
