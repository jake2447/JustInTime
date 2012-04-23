import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class login extends JFrame {
	private JPanel frame;
	private JButton login;
	private JLabel username, password;
	private JTextField name;
	private JPasswordField passw;
	private boolean correct;
	Members memList;

	// private ArrayList<user> classList;

	public login(Members mem) {
		correct = false;
		
		memList = mem;

		this.setSize(new Dimension(300, 200));

		frame = new JPanel();
		frame.setLayout(new GridLayout(3, 2));

		username = new JLabel("UserName");
		password = new JLabel("Password");

		name = new JTextField(16);
		// name.addActionListener(new NameListener());

		passw = new JPasswordField(16);
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
	
	public void close(){
		this.setVisible(false);
	}

	public boolean getAccept() {
		return correct;
	}

	private class LoginListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			if (memList.checkUser(name.getText())){	
				
				User currentU = memList.getUser(name.getText());
		
				if(currentU.checkPassword(new String(passw.getPassword()))){
					
					System.out.println("here");
					
					if (memList.getUser(name.getText()).getType()==0){
						studentUI sUI = new studentUI ((Student)(memList.getUser(name.getText())));
						sUI.setVisible(true);
						//close();
					}
					else {
						instructorUI iUI = new instructorUI((Instructor)(memList.getUser(name.getText())));
						iUI.setVisible(true);
						//close();
					}
				}
			}
			else
			{	
				System.out.println("name not found");
			}
		}
	}
}