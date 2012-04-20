import java.util.Vector;

import javax.swing.JApplet;


public class Test {
	
	public static void main(String args[]){
		
		Instructor i1 = new Instructor("bob", "kraa");
		i1.addAssignment("a1","now",1);
		instructorUI iUI = new instructorUI(i1);
		iUI.setVisible(true);
	}

}
