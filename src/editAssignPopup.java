import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class editAssignPopup extends JFrame
{
    private JList qs;
    private JButton add, edit, delete;
    private JTextField prompt;
    private JPanel box, inside;
    private addQuestionPopup addQ;
    private Assignment x;
    private editQuestionPopup editQ;
    private editAssignPopup ept;    
    private Vector<Question> qList;
    
    public editAssignPopup(Assignment a)
    {
    	x =a; // this may cause a reference problem
        setSize(600, 300);
        ept = this;
        
        qList = a.getQuestionList();

        qs = new JList(qList);        
        qs.setSize(300,150);
        
        
        box = new JPanel();
        box.setLayout(new GridLayout(1,3));
        
        inside = new JPanel();
        inside.setLayout(new GridLayout(3,1));
        
        prompt = new JTextField(a.getName());
        prompt.setEditable(false);
        
        add = new JButton("add");
        add.addActionListener(new addListener());
        add.setSize(30,10);
        edit = new JButton("edit");
        edit.addActionListener(new editListener());
        delete = new JButton("delete");
        delete.addActionListener(new deleteListener());
        
        box.add(add);
        box.add(edit);
        box.add(delete);
        box.setVisible(true);
        
        inside.add(prompt);
        inside.add(qs);
        inside.add(box);
        inside.setVisible(true);
        
        add(inside);
        
      
    }
    
    public Assignment getAssn(){
    	return x;
    }
    
    public JList getJList(){
    	return qs;
    }
    

private class addListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        	addQ = new addQuestionPopup(ept);  // b/c it gets modified here
        	addQ.setVisible(true);
        }
    } 
    
private class editListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        	editQ = new editQuestionPopup(ept,(Question)(qs.getSelectedValue()));
        	editQ.setVisible(true);
        }
    }
    
    private class deleteListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        	x.deleteQuestion((Question)(qs.getSelectedValue()));
        	qs.setListData(qList);
        }
    }
    
    
}
    

