
import java.util.*;

public class Student extends User{
    private ArrayList<StudentAssignment> assignmentList = new ArrayList<StudentAssignment>();

    public Student(){
    	
    }
    
    public Student(ArrayList<StudentAssignment> stAsstList){
    	assignmentList = stAsstList;
    }

    public void checkAssnGrade(int x){
    	assignmentList.get(x);
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