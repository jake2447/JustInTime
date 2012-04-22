import javax.swing.*;
import java.util.*;
import java.awt.*;

public class studentUI extends JFrame
 {
   private JTabbedPane tpane;
   private currentAssignPanel current;
   private prevAssignPanel previous;
   private int APPLET_WIDTH = 1200, APPLET_HEIGHT = 600;
   private Student logStud;
   
   public studentUI (Student logStud){
	   this.logStud = logStud;
	   init(logStud);
   }

   //The method init initializes the Applet with a Pane with two tabs
   public void init(Student logStud)
    {
        current = new currentAssignPanel(logStud);
        previous = new prevAssignPanel(logStud);
        
        tpane = new JTabbedPane();
        tpane.addTab("Current Assignments", current );
        tpane.addTab("Previous Assignments", previous);
        
        getContentPane().add(tpane);
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
        tpane.setVisible(true);

        
    }

}