import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class previousAssignmentView extends JFrame {
	private JTextField mainQ, a0, a1, a2, a3;
	private JLabel title;
	private JRadioButton s0, s1, s2, s3;
	private JButton next;
	private JPanel box, bgroup, agroup;
	private Vector<String> questions;
	private Vector<Integer> answers;
	private StudentAssignment currentA;
	private Question currentQ;
	private int currentIndex;
	private ButtonGroup group;
	private Color def;
	private Members mem;

	public previousAssignmentView(StudentAssignment asst, Members mem) {
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
		s1 = new JRadioButton(" ");
		s2 = new JRadioButton(" ");
		s3 = new JRadioButton(" ");
		
		setRadioButtons();
		
		s0.setEnabled(false);
		s1.setEnabled(false);
		s2.setEnabled(false);
		s3.setEnabled(false);

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
		
		def = a0.getBackground();
		
		setTextColorsSelected();
		setTextColorsCorrect();

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
	
	public void setRadioButtons(){
		
		if (currentQ.getSelectedAnswer()==0){
			s0.setSelected(true);
			s1.setSelected(false);
			s2.setSelected(false);
			s3.setSelected(false);
		}
		else if (currentQ.getSelectedAnswer()==1) {
			s0.setSelected(false);
			s1.setSelected(true);
			s2.setSelected(false);
			s3.setSelected(false);
		}
		else if (currentQ.getSelectedAnswer()==2) {
			s0.setSelected(false);
			s1.setSelected(false);
			s2.setSelected(true);
			s3.setSelected(false);
		}
		else if (currentQ.getSelectedAnswer()==3){
			s0.setSelected(false);
			s1.setSelected(false);
			s2.setSelected(false);
			s3.setSelected(true);
		}
		else{
			s0.setSelected(false);
			s1.setSelected(false);
			s2.setSelected(false);
			s3.setSelected(false);
		}		
	}

public void setTextColorsSelected(){
	if (currentQ.getSelectedAnswer()==0){
		a0.setBackground(Color.red);
		a1.setBackground(def);
		a2.setBackground(def);
		a3.setBackground(def);
	}
	else if (currentQ.getSelectedAnswer()==1) {
		a0.setBackground(def);
		a1.setBackground(Color.red);
		a2.setBackground(def);
		a3.setBackground(def);
	}
	else if (currentQ.getSelectedAnswer()==2) {
		a0.setBackground(def);
		a1.setBackground(def);
		a2.setBackground(Color.red);
		a3.setBackground(def);
	}
	else if (currentQ.getSelectedAnswer()==3) {
		a0.setBackground(def);
		a1.setBackground(def);
		a2.setBackground(def);
		a3.setBackground(Color.red);
		
	}
	else {
		a0.setBackground(Color.blue);
		a1.setBackground(Color.blue);
		a2.setBackground(Color.blue);
		a3.setBackground(Color.blue);
	}
}
public void setTextColorsCorrect(){
		
		if (currentQ.getCorrectAnswer()==0){
			a0.setBackground(Color.green);
			//a1.setBackground(def);
			//a2.setBackground(def);
			//a3.setBackground(def);
		}
		else if (currentQ.getCorrectAnswer()==1) {
			//a0.setBackground(def);
			a1.setBackground(Color.green);
			//a2.setBackground(def);
			//a3.setBackground(def);
		}
		else if (currentQ.getCorrectAnswer()==2) {
			//a0.setBackground(def);
			//a1.setBackground(def);
			a2.setBackground(Color.green);
			//a3.setBackground(def);
		}
		else {
			//a0.setBackground(def);
			//a1.setBackground(def);
			//a2.setBackground(def);
			a3.setBackground(Color.green);
		}
		
	}
	
	
	public void close(){
		mem.dataUpdate();
		this.setVisible(false);
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
				setRadioButtons();
				setTextColorsSelected();
				setTextColorsCorrect();

				if (currentIndex==currentA.getQuestionList().size()-1){
					next.setText("Done");
				}
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				close();
			}
			
		}
	}
}