import java.io.Serializable;


public class User implements Serializable{
	
	private String username;
	private String password;
	
	public User(){
		
	}
	
	public User(User oldUser){
		username = oldUser.getName();
		password = oldUser.getPassword();
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
	
	public String toString(){
		return "username " + username + " password " + password;
	}

}
