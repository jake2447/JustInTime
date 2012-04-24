import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class addStudent extends JFrame
{
    private JLabel name, pass, prompt;
    private JTextField n, p;
    private JButton create;
    private JPanel box, inside;
 
    private Instructor instr;
    private studentScores stu;
    private Members mem;
       
    public addStudent(Instructor i, studentScores st, Members mem)
    {
    	this.mem = mem;
    	this.stu = st;
    	instr =i;
        setSize(300, 200);

        box = new JPanel();
        box.setLayout(new GridLayout(2,2));
        
        inside = new JPanel();
        inside.setLayout(new GridLayout(3,1));
        
        prompt = new JLabel("Enter new Student Name and Password");
        
        name = new JLabel("Name:");
        pass = new JLabel("Password:");
        
        n = new JTextField(20);
        
        p = new JTextField(20);
        
        create = new JButton("add Student");
        create.addActionListener(new adListener());
        
        box.add(name);
        box.add(n);
        box.add(pass);
        box.add(p);
        box.setVisible(true);
        
        inside.add(prompt);
        inside.add(box);
        inside.add(create);
        inside.setVisible(true);       
        add(inside);
                
        
    }

    
private class adListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        	String x = n.getText();
        	if (mem.checkUser(x)){
        		instr.addStudent((Student) mem.getUser(x));
        		stu.getJList().setListData(instr.getSList());
        	}        	
        	setVisible(false);
        }
    }
    

    

    
    
}
    

