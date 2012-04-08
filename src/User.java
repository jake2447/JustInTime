
public class User {
	
	private String username;
	
	public User(){
		
	}
	
	public User(User oldUser){
		username = oldUser.getName();
	}
	
	public User(String name, String password){
		
	}
	
	public String getName(){
		return username;
	}

}
