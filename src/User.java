import java.io.Serializable;


public class User implements Serializable{
	
	private String username;
	private String password;
	protected int TYPE;
	
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
	
	public boolean checkPassword(String pass){
		if (pass == password)
			return true;
		else
			return false;
	}
	
	public int getType(){
		return TYPE;
	}

}
