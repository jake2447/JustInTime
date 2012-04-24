import javax.swing.*;
import java.util.*;
import java.awt.*;

public class instructorUI extends JFrame
 {
   private JTabbedPane tpane;
   private assignPanel assign;
   private scoresPanel scores;
   private int APPLET_WIDTH = 1200, APPLET_HEIGHT = 600;
   Instructor loggedInInstr;
   
   

   public instructorUI(Instructor instructor, Members mem) {
	// TODO Auto-generated constructor stub
	   init(instructor,mem);
	   System.out.println(mem);
   }


//The method init initializes the Applet with a Pane with two tabs
   public void init(Instructor loggedInInstr, Members mem)
    {
	   

	   	assign = new assignPanel(loggedInInstr,mem);
        scores = new scoresPanel(loggedInInstr,mem);
        
        tpane = new JTabbedPane();
        tpane.addTab("Assignments", assign );
        tpane.addTab("Student Scores", scores);
        
        getContentPane().add(tpane);
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
        tpane.setVisible(true);

        
    }

}