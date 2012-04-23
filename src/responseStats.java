
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class responseStats extends JFrame
{
	private JLabel ques, score;
    private JList q,c;
    private JButton select;
    private Vector<String> questions, numCorrect;
    private JPanel box, box2;
    private JComboBox assignList;
    private singleQStats qstats;
    
    public responseStats()
    {
        setSize(400,400);
               
        questions = new Vector<String>();
        questions.add("qone");
        questions.add("qtwo");
        numCorrect = new Vector<String>();
        numCorrect.add("35");
        numCorrect.add("47");
        
        assignList = new JComboBox(questions);
        assignList.addActionListener(new pickListener());
        
        
        q = new JList(questions);
        q.setSize(200,20);
        c = new JList(numCorrect);
        c.setSize(200,20);
        
        select = new JButton("select");
        select.addActionListener(new selectListener());
        
        box = new JPanel();
        box.setLayout(new GridLayout(1,2));
        box.add(q);
        box.add(c);
        
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
           qstats = new singleQStats();
           qstats.setVisible(true);
        }
    }
    
    private class pickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }
    }
    

    
}
