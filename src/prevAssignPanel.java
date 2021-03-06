import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

import java.text.DecimalFormat;
import java.util.*;

public class prevAssignPanel extends JPanel
{
    private JButton selected;
    private JComboBox assignments;
    private JTextField earned;
    private JList assign;
    private DefaultListModel dlist;
    private JPanel box;
    private JLabel prompt;
    private previousAssignmentView prev;
    private Student logStud;
    private StudentAssignment csel;
    private Members mem;
    
    public prevAssignPanel(Student logStud, Members mem)
    {
    	this.mem = mem;
    	dlist = new DefaultListModel();
    	this.logStud = logStud;
        selected = new JButton("View Details");
        selected.addActionListener(new detailListener());
        assignments = new JComboBox();
        assign = new JList();
        assign.addListSelectionListener(new SelectionListener());
        updateDListData();
        assign.setModel(dlist);
                
        earned = new JTextField("Grade for selected assignment: ");
        earned.setEditable(false);      
        
        box = new JPanel();
        prompt = new JLabel("Total Average Grade: " + calculateAvgGrade() + "%");
        box.setLayout(new GridLayout(1,1));
               
        		
        setLayout(new GridLayout(2,2));
        box.add(prompt);
        this.add(assign);
        this.add(earned);
        this.add(box);
        this.add(selected);
        
        box.setVisible(true);
        setVisible(true);
            
    }
    
    public void updateDListData(){
    	Vector<StudentAssignment> v = logStud.getAList();
    	Calendar cal = Calendar.getInstance();
    	for (int i = 0; i < v.size(); i++){
    		if (cal.after(v.get(i).getDueDate()))
    			dlist.addElement(v.get(i));
    	}
    }
    
    public String calculateAvgGrade(){
    	double grade = 0;
    	for (int i = 0; i < dlist.size(); i++){
    		grade += ((StudentAssignment)(dlist.get(i))).getGrade();
    	}
    	grade =  grade / dlist.size();
    	DecimalFormat fmt = new DecimalFormat("###.##");
    	String output = fmt.format(grade);
    	return output;
    }
    
    private class detailListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        	prev = new previousAssignmentView(csel,mem);
        	prev.setVisible(true);
        }
    }
    
    private class SelectionListener implements ListSelectionListener{

		public void valueChanged(ListSelectionEvent e) {
			csel = (StudentAssignment)(assign.getSelectedValue());
			earned.setText("Grade for selected assignment: " + csel.getStringGrade() + "%");
		}    	
    }
    
}
