
import java.util.*;

public class Student extends User{
    private ArrayList<StudentAssignment> assignmentList = new ArrayList<StudentAssignment>();

    public Student(String username, String password){
    	super(username,password);
    }
    
    public Student(ArrayList<StudentAssignment> stAsstList){
    	assignmentList = stAsstList;
    }

    public StudentAssignment tempAsst(int x){
    	return (StudentAssignment) assignmentList.get(x);
    }
    
    public double checkAssnGrade(int x){
    	StudentAssignment temp;
    	temp = tempAsst(x);
    	return temp.getGrade();
    }
    
    public void addAssignment(StudentAssignment asst){
    	assignmentList.add(asst);
    }

    public void takeAssignment(){
    	/**if(//assignment doesn't exist){
    	 *		The program would indicate that there 
    	 *		was an error and return the student to the main menu
    	 * }
    	 * else{
    	 * 		if(//assignment is already complete){
    	 * 			The program would indicate that the assignment is 
    	 * 			already complete and return the student to the main menu
    	 * 		}
    	 * 		else{
    	 * 			The student takes the assignment
    	 * 		}
    	 * }
    	 * 
    	 */
    }
}