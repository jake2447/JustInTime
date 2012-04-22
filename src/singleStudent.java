import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class singleStudent extends JFrame
{
    private JButton selected;
    private JComboBox assignments;
    private JTextField earned, assign;
    private JPanel box;
    private JLabel prompt;
    
    
    public singleStudent()
    {
        setSize(500,600);
        selected = new JButton("View Details");
        selected.addActionListener(new detailListener());
        assignments = new JComboBox();
        earned = new JTextField("points");
        earned.setEditable(false);
        assign = new JTextField("assignments");
        assign.setEditable(false);
        box = new JPanel();
        prompt = new JLabel("Select an Assignment for more detail");
        box.setLayout(new GridLayout(2,1));
        
        setLayout(new GridLayout(2,2));
        box.add(prompt);
        box.add(assignments);
        this.add(assign);
        this.add(earned);
        this.add(box);
        this.add(selected);
        
        box.setVisible(true);
        setVisible(true);
            
    }
    
    private class detailListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        }
    }
    
}
