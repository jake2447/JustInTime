import java.util.*;

public class Members {
	
	private ArrayList<User> userList;
	
	public Members(){
		userList = new ArrayList<User>();
	}
	
	public Members(ArrayList<User> existingUserList){
		userList = new ArrayList<User>(existingUserList);
	}
	
	public User getUser(String username){
		for (int i = 0; i < userList.size(); i++){
			if (userList.get(i).getName()==username){
				return new User();
			}
		}
		return null;
	}
}