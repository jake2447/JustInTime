
public class User {
	
	private String username;
	private String password;
	
	public User(){
		
	}
	
	public User(User oldUser){
		username = oldUser.getName();
	}
	
	public User(String name, String passcode){
		username = name;
		password = passcode;
	}
	
	public String getName(){
		return username;
	}
	
	public String getPassword(){
        return password;
    }

}
