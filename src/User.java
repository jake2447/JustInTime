
public class User {
	
	private String username;
	
	public User(){
		
	}
	
	public User(User oldUser){
		username = oldUser.getName();
	}
	
	public String getName(){
		return username;
	}

}
