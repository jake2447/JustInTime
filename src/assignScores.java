import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class assignScores extends JPanel
{
    private JList assign;
    private JButton view;
    private Vector<Assignment> assignments;
    private responseStats stats;
    private Instructor i;
    
    public assignScores(Instructor instr)
    {
    	i = instr;
    	setLayout(new GridLayout(2,1));
        assignments = i.getAList();
        
        view = new JButton("view");
        view.addActionListener(new view());
        
        assign = new JList(assignments);
        
        add(assign);
        add(view);
        
        setVisible(true);    

    }
    
    private class view implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
        	 Assignment temp = assignments.get(assign.getSelectedIndex());
        	 System.out.println(temp);
            stats = new responseStats(temp);
            stats.setVisible(true);
         }
    }
    
}
