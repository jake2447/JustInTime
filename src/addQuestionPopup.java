import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;


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
	    

	    
