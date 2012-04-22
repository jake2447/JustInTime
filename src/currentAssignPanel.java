import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class currentAssignPanel extends JPanel
{
    private JList curr,due;
    private JButton select;
    private DefaultListModel cAssign;
    private Vector<String> assigns, dates;
    private JPanel box, box2;
    private JComboBox assignList;
    private assignmentView take;
    
    public currentAssignPanel()
    {
        assigns = new Vector<String>();
        assigns.add("one");
        assigns.add("two");
        dates = new Vector<String>();
        dates.add("Assignment");
        dates.add("Due Date");
        
        assignList = new JComboBox(assigns);
        assignList.addActionListener(new pickListener());
        
        cAssign = new DefaultListModel();
        
        curr = new JList(assigns);
        due = new JList(dates);
        
        select = new JButton("select");
        select.addActionListener(new selectListener());
        
        box = new JPanel();
        box.setLayout(new GridLayout(1,2));
        box.add(curr);
        box.add(due);
        
        box2 = new JPanel();
        box2.add(assignList);
        box2.add(select);
        box2.setLayout(new GridLayout(1,2));
        
        box2.setVisible(true);
        box.setVisible(true);
        
        setLayout(new GridLayout(2,1));
        
        
        add(box);
        add(box2);
        
        setVisible(true);
        
    }
    
   private class selectListener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
    	   take = new assignmentView();
           take.setVisible(true);
        }
    }
   
   private class pickListener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           
       }
   }

    
}
