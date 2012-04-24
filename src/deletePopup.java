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
    private boolean delete;
    private int i;
    private Vector<Assignment> list;
    private Members mem;
    private assignPanel ap;
       
    public deletePopup(Vector<Assignment> alist, int index, Members mem, assignPanel ap)
    {
    	this.mem = mem;
    	this.ap = ap;
    	list = alist;
    	i= index;
        delete = false;
        
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
    
    
private class no implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            delete = false;
            setVisible(false);
        }
    }
    
private class yes implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            delete = true;
            list.remove(i);
            ap.updateDListData();
            ap.getJList().setModel(ap.getDList());
            mem.dataUpdate();
            setVisible(false);
            
        }
    }
    

    
    
}
    

