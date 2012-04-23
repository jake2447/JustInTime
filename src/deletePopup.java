import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class deletePopup extends JFrame
{

    private JButton y,n;
    private JTextField prompt;
    private JPanel box, inside;
    private boolean delete,i;
       
    public deletePopup()
    {
        delete = false;
        i = false;
        
        setSize(300, 200);

        box = new JPanel();
        box.setLayout(new GridLayout(1,2));
        
        inside = new JPanel();
        inside.setLayout(new GridLayout(2,1));
        
        prompt = new JTextField("Continue with deletion?");
        prompt.setEditable(false);
        
        y = new JButton("yes");
        y.addActionListener(new yes());
        y.setSize(30,10);
        n = new JButton("no");
        n.addActionListener(new no());
        
        box.add(y);
        box.add(n);
        box.setVisible(true);
        
        inside.add(prompt);
        inside.add(box);
        inside.setVisible(true);       
        add(inside);
                
        
    }
    
public boolean DeleteIt()
{
    if(delete)
    {
        delete = false;
        return true;
    }
    else
    return delete;
}

public boolean Input()
{
    return i;
}

    
private class no implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            delete = false;
            setVisible(false);
            i=true;
        }
    }
    
private class yes implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            delete = true;
            setVisible(false);
            i=true;
        }
    }
    

    
    
}
    

