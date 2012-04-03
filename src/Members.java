import java.util.*;

public class Members {
	
	private ArrayList<User> userList;
	
	public Members(){
		userList = new ArrayList<User>();
	}
	
	public Members(ArrayList<User> existingUserList){
		userList = new ArrayList<User>(existingUserList);
	}
}