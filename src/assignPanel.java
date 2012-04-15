import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class assignPanel extends JPanel
{
    private JButton add, edit, delete;
    private JList assigns;
    private JPanel buttons;
    private Vector<String> assignList;
    
    
    public assignPanel()
    {
        assignList = new Vector<String>();
        assignList.add("one");
        
        add = new JButton("Add Assignment");
        
        edit = new JButton("Edit Assignment");
        
        delete = new JButton("Delete Assignment");
        
        assigns = new JList(assignList);
        
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,3));
        buttons.add(add);
        buttons.add(edit);
        buttons.add(delete);
        
        setLayout(new GridLayout(2,1));
        add(assigns);
        add(buttons);
        assigns.setVisible(true);
        buttons.setVisible(true);
        
    }
    
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        
        }
    }
    
}
