import java.util.*;

public class Instructor extends User{
    private ArrayList<Student> studentList;
    private ArrayList<Assignment> instrAssignmentList;

    public Instructor(String username, String password){
    	super(username, password);
    	studentList = new ArrayList();
    	instrAssignmentList = new ArrayList();
    }

    public void createAssn(int x, Assignment asst){
    	instrAssignmentList.add(x, asst);
    }

    public void addQuestion(int x, Question ques, Assignment asst){
    	asst.questionList.add(x, ques);
    }

    public void removeQuestion(int x, Assignment asst){
    	asst.questionList.remove(x);
    }

    public void editQuestion(int x, Question editedQues, Assignment asst){
    	asst.questionList.set(x, editedQues);
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