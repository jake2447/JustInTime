
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.event.*;
	import java.util.*;

	public class assignmentView extends JFrame
	{
	    private JTextField mainQ, a1, a2, a3, a4;
	    private JLabel title, body;
	    private JRadioButton s1,s2,s3,s4;
	    private JButton next;
	    private JPanel box, bgroup, agroup;
	    private int selected;
	    private Vector<String> questions;
	    private Vector<Integer> answers;
	    private StudentAssignment currentA;
	    private Question currentQ;
	    private ButtonGroup group;
	    
	    public assignmentView(StudentAssignment asst)
	    {
	    	currentA = asst;
	    	currentQ = currentA.getQuestionList().get(0);
	    	setSize(600,300);
	    	title = new JLabel(currentA.getName());
	    	
	    	body = new JLabel(currentQ.getQuestionBody());
	    	a1 = new JTextField(128);
	    	a2 = new JTextField(128);
	    	a3 = new JTextField(128);
	    	a4 = new JTextField(128);
	    	
	    	s1 = new JRadioButton(" ");
	    	s1.addActionListener(new Listener1());
	    	
	    	s2 = new JRadioButton(" ");
	    	s2.addActionListener(new Listener2());
	    	s3 = new JRadioButton(" ");
	    	s3.addActionListener(new Listener3());
	    	s4 = new JRadioButton(" ");
	    	s4.addActionListener(new Listener4());
	    	
	    	group = new ButtonGroup();
	    	group.add(s1);
	    	group.add(s2);
	    	group.add(s3);
	    	group.add(s4);
	    	
	    	next = new JButton("Next");
	    	next.addActionListener(new NextListener());
	    	
	    	bgroup = new JPanel();
            bgroup.setLayout(new GridLayout(4,1));
            bgroup.add(s1);
            bgroup.add(s2);
            bgroup.add(s3);
            bgroup.add(s4);
            bgroup.setVisible(true);
            
            agroup = new JPanel();
            agroup.setLayout(new GridLayout(4,1));
            agroup.add(a1);
            agroup.add(a2);
            agroup.add(a3);
            agroup.add(a4);
            agroup.setVisible(true);
            
            box = new JPanel();
            box.setLayout(new GridLayout(1,2));
            box.add(bgroup);
            box.add(agroup);
            box.setVisible(true);
	    	
	    	setLayout(new GridLayout(4,1));
	    	add(title);
	    	add(body);
	    	add(box);
	    	add(next);
	    	
	    //	setVisible(true);
	    	
	    	
	    }
	    
	    public int getAnswer()
	    {
	        return selected;
	       }
	    
	       private class Listener1 implements ActionListener
	       {
	           public void actionPerformed(ActionEvent event)
	            {
	        	   selected = 1;
	            }
	       }
	    
	       private class Listener2 implements ActionListener
	       {
	           public void actionPerformed(ActionEvent event)
	            {
	        	   selected = 2;
	            }
	       }
	       
	       private class Listener3 implements ActionListener
	       {
	           public void actionPerformed(ActionEvent event)
	            {
	        	   selected = 3;
	            }
	       }
	       
	       private class Listener4 implements ActionListener
	       {
	           public void actionPerformed(ActionEvent event)
	            {
	        	   selected = 4;
	            }
	       }
	       
	       private class NextListener implements ActionListener
	       {
	           public void actionPerformed(ActionEvent event)
	            {
	        	   
	            }
	       }
	    
	}
	    
