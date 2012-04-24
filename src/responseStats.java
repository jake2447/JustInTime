
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class responseStats extends JFrame
{
	private JLabel ques, score;
    private JList q,c;
    private JScrollPane qscroll, cscroll;
    private JButton select;
    private Vector<Question> questions;
    private Vector<Double> numCorrect;
    private JPanel box, box2;
    private JComboBox assignList;
    private singleQStats qstats;
    private Assignment a;
    private Instructor instr;
    
    public responseStats(Assignment x, Instructor i)
    {
    	this.instr = i;
        setSize(400,400);
        a = x;               
        questions = a.getQuestionList();
        
        assignList = new JComboBox(questions);
        assignList.addActionListener(new pickListener());
        
        numCorrect = new Vector<Double>();
        for (int in = 0; in < questions.size(); in++){
        	numCorrect.add(i.getQuestionAverageCorrect(in, a));
        }
        
        
        q = new JList(questions);
        qscroll = new JScrollPane(q);
        qscroll.setSize(200,20);
        c = new JList(numCorrect);
        cscroll = new JScrollPane(c);
        cscroll.setSize(200,20);
        
        select = new JButton("select");
        select.addActionListener(new selectListener());
        
        box = new JPanel();
        box.setLayout(new GridLayout(1,2));
        box.add(qscroll);
        box.add(cscroll);
        
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
           qstats = new singleQStats(instr, (Question) q.getSelectedValue(),a);
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
