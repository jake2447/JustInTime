import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class assignScores extends JPanel
{
    private JList assigns;
    private JButton view;
    private Vector<String> assignments;
    
    public assignScores()
    {
        assignments = new Vector<String>();
        String j = "ghj";
        for(int i = 1; i<10;i++)
        {
            assignments.add(j);
        }
        
        assignments.add("ONe");
        
        view = new JButton("view");

        
        assigns = new JList(assignments);
        
        add(assigns);
        add(view);
        
        setVisible(true);
        

    }
    
}
