import java.io.*;


public class Jittmain {
	
	public static void main (String args[]){
		Members mem;
		/*try {
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
		*/
		
		mem = new Members();
		mem.addUser("s1", "s1pass", 0);
		mem.addUser("i1", "i1pass", 1);
		
		System.out.println(mem);
		
		login log = new login(mem);
		
		//log.setVisible(true);
	}

}
