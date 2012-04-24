import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;
import java.util.*;

public class assignScores extends JPanel
{
    private JList assign;
    private JButton view, refresh;
    private JPanel box;
    private Vector<Assignment> assignments;
    private responseStats stats;
    private Instructor i;
    
    public assignScores(Instructor instr)
    {
    	i = instr;
    	setLayout(new GridLayout(2,1));
        assignments = i.getAList();
        
        box = new JPanel();
        box.setLayout(new GridLayout(1,2));
        
        view = new JButton("view");
        view.addActionListener(new view());
        
        refresh = new JButton("refresh");
        refresh.addActionListener(new refresh());
        box.add(view);
        box.add(refresh);
        
        assign = new JList(assignments);
        
        add(assign);
        add(box);
        
        setVisible(true);    

    }
    
    private class view implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
        	 
        	 Assignment temp = assignments.get(assign.getSelectedIndex());
        	 System.out.println(temp);
            stats = new responseStats(temp, i);
            stats.setVisible(true);
            
         }
    }
    
    private class refresh implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			assign.setListData(assignments);
			
		}
    	
    }
    
}
