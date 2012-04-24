import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class studentScores extends JPanel {
	private Vector<Student> stuList;
	private JList students;
	private JButton view, add;
	private singleStudent stu;
	private JPanel box;
	private addStudent as;
	private Instructor instr;

	public studentScores(Instructor logInInstr) {
		instr = logInInstr;
		
		as = new addStudent(instr,this);
		
		setLayout(new GridLayout(2, 1));
		stuList = instr.getSList();
		
		view = new JButton("View Student");
		view.addActionListener(new singleView());
		
		add = new JButton("add Student");
		add.addActionListener(new addListener());
		
		box = new JPanel();
		box.setLayout(new GridLayout(1,2));

		students = new JList(stuList);
		box.add(view);
		box.add(add);
		box.setVisible(true);
		
		add(students);
		add(box);

		setVisible(true);

	}
	
	public JList getJList(){
		return students;
	}
    

	private class singleView implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			stu = new singleStudent((Student)(students.getSelectedValue()));
			stu.setVisible(true);
		}
	}
	
	private class addListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			as.setVisible(true);
			
		}
	}
}
