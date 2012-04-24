import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class assignmentView extends JFrame {
	private JTextField mainQ, a0, a1, a2, a3;
	private JLabel title;
	private JRadioButton s0, s1, s2, s3;
	private JButton next;
	private JPanel box, bgroup, agroup;
	private StudentAssignment currentA;
	private Question currentQ;
	private int currentIndex;
	private ButtonGroup group;
	private Members mem;

	public assignmentView(StudentAssignment asst, Members mem) {
		this.mem = mem;
		currentA = asst;
		currentIndex = 0;
		currentQ = currentA.getQuestionList().get(currentIndex);
		setSize(600, 300);
		title = new JLabel("Viewing question " + (currentIndex + 1) + " from " + currentA.getName());

		mainQ = new JTextField(currentQ.getQuestionBody(), 256);
		mainQ.setEditable(false);
		
		a0 = new JTextField(128);
		a0.setText(currentQ.getAnswerText().get(0));
		a0.setEditable(false);
		
		a1 = new JTextField(128);
		a1.setText(currentQ.getAnswerText().get(1));
		a1.setEditable(false);
		
		a2 = new JTextField(128);
		a2.setText(currentQ.getAnswerText().get(2));
		a2.setEditable(false);
		
		a3 = new JTextField(128);
		a3.setText(currentQ.getAnswerText().get(3));
		a3.setEditable(false);

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

		next = new JButton("Next");
		next.addActionListener(new NextListener());

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
		add(next);

		// setVisible(true);

	}
	
	public void close(){
		mem.dataUpdate();
		this.setVisible(false);
	}

	private class Listener0 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentQ.setSelectedAnswer(0);
		}
	}

	private class Listener1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentQ.setSelectedAnswer(1);
		}
	}

	private class Listener2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentQ.setSelectedAnswer(2);
		}
	}

	private class Listener3 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			currentQ.setSelectedAnswer(3);
		}
	}

	private class NextListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			try	{ 
				currentIndex++;
				currentQ = currentA.getQuestionList().get(currentIndex);
				mainQ.setText(currentQ.getQuestionBody());
				a0.setText(currentQ.getAnswerText().get(0));
				a1.setText(currentQ.getAnswerText().get(1));
				a2.setText(currentQ.getAnswerText().get(2));
				a3.setText(currentQ.getAnswerText().get(3));
				title.setText("Viewing question " + (currentIndex + 1) + " from " + currentA.getName());

				if (currentIndex==currentA.getQuestionList().size()-1){
					next.setText("Submit");
				}
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				close();
			}
			
		}
	}

}
	    
