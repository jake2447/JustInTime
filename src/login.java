import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class login extends JApplet {
	private JPanel frame;
	private JButton login;
	private JLabel username, password;
	private JTextField name, passw;
	private boolean correct;
	Members memList;

	// private ArrayList<user> classList;

	public login(Members mem) {
		correct = false;
		
		memList = mem;

		setPreferredSize(new Dimension(300, 200));

		frame = new JPanel();
		frame.setLayout(new GridLayout(3, 2));

		username = new JLabel("UserName");
		password = new JLabel("Password");

		name = new JTextField(16);
		// name.addActionListener(new NameListener());

		passw = new JTextField(16);
		// passw.addActionListener(new PassListener());

		login = new JButton("Continue");
		login.addActionListener(new LoginListener());

		frame.add(username);
		frame.add(name);
		frame.add(password);
		frame.add(passw);
		frame.add(login);
		add(frame);
		frame.setVisible(true);
		setVisible(true);

	}

	public boolean getAccept() {
		return correct;
	}

	private class LoginListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (memList.checkUser(name.getText())){
				if(memList.getUser(name.getText()).checkPassword(passw.getText())){
					if (memList.getUser(name.getText()).getType()==0){
						studentUI sUI = new studentUI ((Student)(memList.getUser(name.getText())));
					}
					else {
						instructorUI iUI = new instructorUI((Instructor)(memList.getUser(name.getText())));
					}
				}
			}
		}
	}
}