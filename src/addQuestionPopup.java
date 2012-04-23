import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

<<<<<<< HEAD
public class addQuestionPopup extends JFrame {
	private JTextField mainQ, a0, a1, a2, a3;
	private JLabel title;
	private JRadioButton s0, s1, s2, s3;
	private JButton submit;
	private JPanel box, bgroup, agroup;
	private Assignment currentA;
	private editAssignPopup ep;
	private Question currentQ;
	private int currentIndex;
	private ButtonGroup group;

	public addQuestionPopup(editAssignPopup ep) {
		
		currentQ = new Question();
		this.ep = ep;
		currentA = ep.getAssn();
		
		currentIndex = currentA.getQuestionList().size();
		setSize(600, 300);
		title = new JLabel("Viewing question " + (currentIndex + 1) + " from " + currentA.getName());

		mainQ = new JTextField(256);
		mainQ.setEditable(true);
		
		a0 = new JTextField(128);
		a0.setEditable(true);
		
		a1 = new JTextField(128);
		a1.setEditable(true);
		
		a2 = new JTextField(128);
		a2.setEditable(true);
		
		a3 = new JTextField(128);
		a3.setEditable(true);

		s0 = new JRadioButton(" ");
		s0.addActionListener(new Listener0());

		s1 = new JRadioButton(" ");
		s1.addActionListener(new Listener1());
		s2 = new JRadioButton(" ");
		s2.addActionListener(new Listener2());
		s3 = new JRadioButton(" ");
		s3.addActionListener(new Listener3());

		group = new ButtonGroup();
		group.add(s0);
		group.add(s1);
		group.add(s2);
		group.add(s3);

		submit = new JButton("Submit");
		submit.addActionListener(new SubmitListener());

		bgroup = new JPanel();
		bgroup.setLayout(new GridLayout(4, 1));
		bgroup.add(s0);
		bgroup.add(s1);
		bgroup.add(s2);
		bgroup.add(s3);
		bgroup.setVisible(true);

		agroup = new JPanel();
		agroup.setLayout(new GridLayout(4, 1));
		agroup.add(a0);
		agroup.add(a1);
		agroup.add(a2);
		agroup.add(a3);
		agroup.setVisible(true);

		box = new JPanel();
		box.setLayout(new GridLayout(1, 2));
		box.add(bgroup);
		box.add(agroup);
		box.setVisible(true);

		setLayout(new GridLayout(4, 1));
		add(title);
		add(mainQ);
		add(box);
		add(submit);

		// setVisible(true);

=======
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
	    	title = new JLabel("add question");
	    	
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
	    
>>>>>>> branch 'master' of git@github.com:jake2447/JustInTime.git
	}
	
	public void close(){
		a0.setText("");
		a1.setText("");
		a2.setText("");
		a3.setText("");
		s0.setSelected(false);
		s1.setSelected(false);
		s2.setSelected(false);
		s3.setSelected(false);
		this.setVisible(false);
	}

	private class Listener0 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentQ.setCorrectAnswer(0);
		}
	}

	private class Listener1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentQ.setCorrectAnswer(1);
		}
	}

	private class Listener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentQ.setCorrectAnswer(2);
		}
	}

	private class Listener3 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentQ.setCorrectAnswer(3);
		}
	}

	private class SubmitListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			Vector<Question> qlist = currentA.getQuestionList();
			
			String body, sa0,sa1,sa2,sa3;
			
			body = mainQ.getText();
			sa0 = a0.getText();
			sa1 = a1.getText();
			sa2 = a2.getText();
			sa3 = a3.getText();
			Vector v = currentQ.getAnswerText();
			
			currentQ.setQuestionBody(body);
			v.add(sa0);
			v.add(sa1);
			v.add(sa2);
			v.add(sa3);
			
			currentQ.setAnswerText(v);
			currentA.addQuestion(currentQ);
			
			ep.getJList().setListData(currentA.getQuestionList());
			
			close();
		}
	}

}
	    

	    
