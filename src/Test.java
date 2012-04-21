import java.util.Vector;

import javax.swing.JApplet;


public class Test {
	
	public static void main(String args[]){
		
		Assignment a = new Assignment("assign1", "21/04/2012 11:59", 1);
		System.out.println("The due date is " + a.getDueDate().getTime());
		
	}

}
