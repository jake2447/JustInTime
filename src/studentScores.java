import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class studentScores extends JPanel
{
    private Vector<String> stuList;
    private JList students;
    private JButton view;
    private singleStudent stu;
    
    
    public studentScores()
    {
    	setLayout(new GridLayout(2,1));
        stuList = new Vector<String>();
        stuList.add("one");
        view = new JButton("View Student");
        view.addActionListener(new singleView());
        
        students = new JList(stuList);
        
        add(students);
        add(view);
        
        setVisible(true);
        
    }
    private class singleView implements ActionListener
    {
         public void actionPerformed(ActionEvent e)
         {
            stu = new singleStudent();
            stu.setVisible(true);
         }
    }
}
