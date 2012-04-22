
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.event.*;
	import java.util.*;

	public class assignmentView extends JFrame
	{
	    private JTextField mainQ, a1, a2, a3, a4;
	    private JLabel title;
	    private JRadioButton s1,s2,s3,s4;
	    private JButton next;
	    private JPanel box;
	    private int selected;
	    private Vector<String> questions;
	    private Vector<Integer> answers;
	    private Assignment current;
	    
	    public assignmentView()
	    {
	    	setSize(600,300);
	    	title = new JLabel("Name HERE");
	    	
	    	mainQ = new JTextField(256);
	    	a1 = new JTextField(128);
	    	a2 = new JTextField(128);
	    	a3 = new JTextField(128);
	    	a4 = new JTextField(128);
	    	
	    	s1 = new JRadioButton();
	    	s1.addActionListener(new Listener1());
	    	s2 = new JRadioButton();
	    	s2.addActionListener(new Listener2());
	    	s3 = new JRadioButton();
	    	s3.addActionListener(new Listener3());
	    	s4 = new JRadioButton();
	    	s4.addActionListener(new Listener4());
	    	
	    	next = new JButton("Next");
	    	next.addActionListener(new NextListener());
	    	
	    	box = new JPanel();
	    	box.setLayout(new GridLayout(4,2));
	    	
	    	box.add(s1);
	    	box.add(a1);
	    	box.add(s2);
	    	box.add(a2);
	    	box.add(s3);
	    	box.add(a3);
	    	box.add(s4);
	    	box.add(a4);
	    	box.setVisible(true);
	    	
	    	setLayout(new FlowLayout());
	    	add(title);
	    	add(mainQ);
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
	        	  // while(count<questionlist.size())
// 	        	  {
// 	        	      count ++;
// 	        	      answers.add(selected);
// 	        	      reset text fields to new question
// 	        	  }
	            }
	       }
	    
	}
	    
