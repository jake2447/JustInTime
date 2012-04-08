import java.util.*;

public class Members {
	
	//will store a list of all users on the system
	//typed as user but elements will be either students or instructors
	private ArrayList<User> userList;
	
	//default constructor
	public Members(){
		userList = new ArrayList<User>();
		int x = 5;
	}
	
	//constructor with a list of users passed as a parameters
	public Members(ArrayList<User> existingUserList){
		userList = new ArrayList<User>(existingUserList);
	}
	
	//method that searches the list of users
	//if the user exists a copy of that user is returned
	//if the user does not exist return null
	public User getUser(String username){
		for (int i = 0; i < userList.size(); i++){
			if (userList.get(i).getName()==username){
				return new User(userList.get(i));
			}
		}
		return null;
	}
}