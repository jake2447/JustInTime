import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class studentScores extends JPanel {
	private Vector<String> stuList;
	private JList students;
	private JButton view, add;
	private singleStudent stu;
	private JPanel box;
	private addStudent as;

	public studentScores() {
		setLayout(new GridLayout(2, 1));
		stuList = new Vector<String>();
		stuList.add("one");
		
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

	private class singleView implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			stu = new singleStudent();
			stu.setVisible(true);
		}
	}
	
	private class addListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			as = new addStudent();
			as.setVisible(true);
			
		}
	}
}
