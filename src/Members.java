import java.io.*;
import java.util.*;

public class Members implements Serializable{
	
	//will store a list of all users on the system
	//typed as user but elements will be either students or instructors
	private Vector<User> userList;
	
	//default constructor
	public Members(){
		userList = new Vector<User>();
	}
	
	//constructor with a list of users passed as a parameters
	public Members(Vector<User> existingUserList){
		userList = new Vector<User>(existingUserList);
	}
	
	//method that searches the list of users
	//if the user exists a copy of that user is returned
	//if the user does not exist return null
	public User getUser(String username){
		
		for (int i = 0; i < userList.size(); i++){	

			if (userList.get(i).getName().equals(username)){
				return (userList.get(i));				
			}
		}
		
		return null;
	}
	
	public void addUser(String username, String password, int accountType){
		if (accountType==0){
			userList.add(new Student(username,password));
		}
		else {
			userList.add(new Instructor(username, password));
		}
	}
	
	public void dataUpdate(){
		try {
			FileOutputStream fout = new FileOutputStream("members.data");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(this);			
		}
		catch (FileNotFoundException e){
			
		}
		catch (IOException e){
			
		}
		
	}
	
	public boolean checkUser(String username){
		for (int i = 0; i < userList.size(); i++){
			if (userList.get(i).getName().equals(username)){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		String names = "";
		for (int i = 0; i < userList.size(); i++){
			names += userList.get(i).getName();
		}
		return names;
	}
}