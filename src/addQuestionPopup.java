	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.event.*;
	import java.util.*;

	public class addQuestionPopup extends JFrame
	{
	    private JTextField mainQ, a1, a2, a3, a4;
	    private JLabel title;
	    private JRadioButton s1,s2,s3,s4;
	    private JButton submit;
	    private JPanel box,box2;
	    private int selected;
	    private Question created;
	    private Vector<String> questions;
	    private Assignment current;
	    private ButtonGroup group;
	    
	    public addQuestionPopup(Assignment a)
	    {
	    	current = a;
	    	setSize(600,300);
	    	title = new JLabel("Name HERE");
	    	
	    	mainQ = new JTextField(100);
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
	    	
	    	group = new ButtonGroup();
	    	group.add(s1);
	    	group.add(s2);
	    	group.add(s3);
	    	group.add(s4);
	    	
	    	submit = new JButton("Submit");
	    	submit.addActionListener(new SubmitListener());
	    	
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
	    	
	    	box2 = new JPanel();
	    	box2.setLayout(new GridLayout(2,1));
	    	box2.add(title);
	    	box2.add(mainQ);
	    	box2.setVisible(true);
	    	
	    	setLayout(new GridLayout(3,1));
	    	add(box2);
	    	add(box);
	    	add(submit);
	    	
	    	setVisible(true);
	    	
	    	
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
	       
	       private class SubmitListener implements ActionListener
	       {
	           public void actionPerformed(ActionEvent event)
	            {
	        	   questions = new Vector<String>();
	        	   questions.add(a1.getText());
	        	   questions.add(a2.getText());
	        	   questions.add(a3.getText());
	        	   questions.add(a4.getText());
	        	   
	        	   
	        	   created = new Question(mainQ.getText(), questions,selected);
	        	   current.addQuestion(created);
	            }
	       }
	    
	}
	    
