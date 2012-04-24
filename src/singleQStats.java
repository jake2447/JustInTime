import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class singleQStats extends JFrame
{
    private Vector<String> answers;
    private Vector<Double> breakdown;
    private JPanel box;
    private JLabel title;
    private JTextArea op, s;
    
    public singleQStats(Instructor instr, Question q, Assignment asst)
    {

        setSize(400,400);
        
        title = new JLabel("Selected Responses for Question: " + asst.getQuestionList().indexOf(q) + " from assignment " + asst.getName());
        s = new JTextArea();
        s.setText("");
        s.setEditable(false);
        
        op = new JTextArea();
        op.setText("");
        op.setEditable(false);
       
        answers = q.getAnswerText();
        
        breakdown = instr.getQuestionBreakdown(asst.getQuestionList().indexOf(q), asst);
        
        for(int i=0;i<4;i++)
        {
            op.append(answers.get(i) + "\n");
        }
        
        for(int i=0;i<4;i++)
        {
            s.append(breakdown.get(i) + "\n");
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
