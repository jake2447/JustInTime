import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class currentAssignPanel extends JPanel
{
    private JList leftList,due;
    private JButton select;
    //private DefaultListModel cAssign;
    private Vector<StudentAssignment> assigns;
    private Vector<String> dates;
    private JPanel box, box2;
    private JComboBox assignList;
    private assignmentView take;
    private Student logStud;
    private DefaultListModel dlist;
    
    public currentAssignPanel(Student logStud)
    {
    	this.logStud = logStud;
    	assigns = logStud.getAList();
        dlist = new DefaultListModel();
        
        
        updateDListData();

        
        
        
        dates = new Vector<String>();
        dates.add("Assignment");
        dates.add("Due Date");
        
        assignList = new JComboBox(assigns);
        assignList.addActionListener(new pickListener());
        
        //cAssign = new DefaultListModel();
        
        leftList = new JList(assigns);
        due = new JList(dates);
        leftList.setModel(dlist);
        select = new JButton("select");
        select.addActionListener(new selectListener());
        
        box = new JPanel();
        box.setLayout(new GridLayout(1,1));
        box.add(leftList);

        
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
    
    public void updateDListData(){
    	Vector<StudentAssignment> v = assigns;
    	Calendar cal = Calendar.getInstance();
    	
    	for (int i = 0; i < v.size(); i++){
    		if (cal.before(v.get(i).getDueDate()))
    			dlist.addElement(v.get(i));
    	}
    }
    
   private class selectListener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
    	   StudentAssignment csel = (StudentAssignment)(leftList.getSelectedValue());
    	   take = new assignmentView(csel);
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
