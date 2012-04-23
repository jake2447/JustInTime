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
    
    public void addAssignment(String name, String date, int number){
    	instrAssignmentList.add(new Assignment(name,date,number));
    }
    
    public void deleteAssignment(Assignment asst){
    	instrAssignmentList.remove(asst);
    }

    public double getAssignmentAverage(Assignment assn){
    	int aNum = assn.getAssignmentNumber();
    	double avg = 0;
    	for (int i = 0; i < studentList.size(); i++){
    		StudentAssignment temp = studentList.get(i).findAssignemnt(aNum);
    		avg += temp.getGrade();
    	}
    	return avg / studentList.size();
    }

    public void assign(Assignment asst){
        for(int count=0; count < studentList.size(); count++){
        	studentList.get(count).addAssignment(asst);
        }
    }
}