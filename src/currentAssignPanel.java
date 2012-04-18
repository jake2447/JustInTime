import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class currentAssignPanel extends JPanel
{
    private JList curr;
    private JButton select;
    private Vector<String> cAssign;
    
    public currentAssignPanel()
    {
        cAssign = new Vector<String>();
        cAssign.add("a1");
        cAssign.add("a2");
        
        setLayout(new GridLayout(2,1));
        
        curr = new JList(cAssign);
        
        select = new JButton("select");
        select.addActionListener(new selectListener());
        
        add(curr);
        add(select);
        
        setVisible(true);
        
    }
    
   private class selectListener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           
        }
    }

    
}
