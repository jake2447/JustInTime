import java.io.*;
import java.util.Vector;


public class Jittmain {
	
	public static void main (String args[]) throws IOException{
		Members mem;
		try {
			FileInputStream fin = new FileInputStream("members.data");
			InputStream buffer = new BufferedInputStream(fin);
			ObjectInputStream oin = new ObjectInputStream(fin);
			mem = (Members) oin.readObject();
		}
		catch (FileNotFoundException e){
			System.out.println("error 1");
			mem = new Members();
		}
		catch (IOException e) {
			System.out.println("error 2");
			mem = new Members();
		}
		catch (ClassNotFoundException e) {
			System.out.println("error 3");
			mem = new Members();
		}
		
		mem.dataUpdate();

		login log = new login(mem);
		
		//log.setVisible(true);
	}

}
