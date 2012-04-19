import java.io.*;
import java.util.ArrayList;

public class Test {
	
	public static void main(String args[]){
		
		Members mem = new Members();
		
		try {			
			FileInputStream fin = new FileInputStream("members.data");
			ObjectInputStream oin = new ObjectInputStream(fin);
			mem = (Members) oin.readObject();
		}
		catch (FileNotFoundException e){
			mem.addUser("jake2447", "tacobell24", 0);
			mem.addUser("mrhongkong", "isuck", 1);
			System.out.println("new file");
		}
		catch (IOException e){
			System.out.println("error 1");
		}
		catch (ClassNotFoundException e){
			System.out.println("error 2");
		}
		
		try {
			mem.dataUpdate();			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("error 3");
		}
		catch (IOException e) {
			System.out.println("error 4");
		}
		
		System.out.println(mem.toString());
		
	}
}
