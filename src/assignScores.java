import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class assignScores extends JPanel
{
    private JList assigns;
    private JButton view;
   
    
    public assignScores()
    {
        view = new JButton("view");

        
        assigns = new JList();
        
        add(assigns);
        add(view);
        
        setVisible(true);
        

    }
    
}
