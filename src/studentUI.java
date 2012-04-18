import javax.swing.*;
import java.util.*;
import java.awt.*;

public class studentUI extends JApplet
 {
   private JTabbedPane tpane;
   private currentAssignPanel current;
   private prevAssignPanel previous;
   private int APPLET_WIDTH = 1200, APPLET_HEIGHT = 600;
   

   //The method init initializes the Applet with a Pane with two tabs
   public void init()
    {
        current = new currentAssignPanel();
        previous = new prevAssignPanel();
        
        tpane = new JTabbedPane();
        tpane.addTab("Current Assignments", current );
        tpane.addTab("Previous Assignments", previous);
        
        getContentPane().add(tpane);
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
        tpane.setVisible(true);

        
    }

}