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
    
    
    public studentScores()
    {
        stuList = new Vector<String>();
        stuList.add("one");
        view = new JButton("View Student");
        
        students = new JList(stuList);
        
        add(students);
        add(view);
        
        setVisible(true);
        
    }
}
