import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class singleQStats extends JFrame
{
    private Vector<String> questions, selected;
    private JPanel box;
    private JLabel title;
    private JTextArea op, s;
    
    public singleQStats()
    {
        setSize(400,400);
        
        title = new JLabel("Selected Responses for Question");
        s = new JTextArea();
        s.setText("");
        s.setEditable(false);
        
        op = new JTextArea();
        op.setText("");
        op.setEditable(false);
       
        questions = new Vector<String>();
        questions.add("A");
        questions.add("B");
        questions.add("C");
        questions.add("D");
        selected = new Vector<String>();
        selected.add("35");
        selected.add("47");
        selected.add("55");
        selected.add("43");
        
        for(int i=0;i<4;i++)
        {
            op.append(questions.get(i) + "\n");
        }
        
        for(int i=0;i<4;i++)
        {
            s.append(selected.get(i) + "\n");
        }
        
        
        box = new JPanel();
        box.setLayout(new GridLayout(1,2));
        box.add(op);
        box.add(s);
        
        box.setVisible(true);
        
        setLayout(new GridLayout(2,1));        
        
        add(title);
        add(box);
        
        setVisible(true);
        
    }
    
}
