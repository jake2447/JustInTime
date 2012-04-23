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
   

   public instructorUI(Instructor instructor) {
	// TODO Auto-generated constructor stub
	   init(instructor);
   }


//The method init initializes the Applet with a Pane with two tabs
   public void init(Instructor loggedInInstr)
    {
        assign = new assignPanel(loggedInInstr);
        scores = new scoresPanel(loggedInInstr);
        
        tpane = new JTabbedPane();
        tpane.addTab("Assignments", assign );
        tpane.addTab("Student Scores", scores);
        
        getContentPane().add(tpane);
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
        tpane.setVisible(true);

        
    }

}