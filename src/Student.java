
import java.util.*;

public class Student extends User{
    private Vector<StudentAssignment> assignmentList = new Vector<StudentAssignment>();
    private String username;
	private String password;

    public Student(String username, String password){
    	super(username,password);
    	this.username = username;
    	this.password = password;
    	TYPE = 0;
    }
    
    /*public Student(Vector<StudentAssignment> stAsstList){
    	assignmentList = stAsstList;
    	TYPE = 0;
    }*/

    public StudentAssignment tempAsst(int x){
    	return (StudentAssignment) assignmentList.get(x);
    }
    
    public double checkAssnGrade(int x){
    	StudentAssignment temp;
    	temp = tempAsst(x);
    	return temp.getGrade();
    }
    
    public void addAssignment(Assignment asst){
    	StudentAssignment newAsst = new StudentAssignment(asst);
    	assignmentList.add(newAsst);
    }
    
    public StudentAssignment findAssignemnt(String tstamp)
    {
    	for (int i = 0; i < assignmentList.size(); i++){
    		if (assignmentList.get(i).getTStamp().equals(tstamp))
    			return assignmentList.get(i);
    	}
    	return null;
    }
    
    public Vector<StudentAssignment> getAList(){
    	return assignmentList;
    }
    
    public String toString()
    {
    	return username;
    }

}
