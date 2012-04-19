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

	// private ArrayList<user> classList;

	public login() {
		correct = false;

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
			
		}
	}
}