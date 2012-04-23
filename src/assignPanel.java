import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

import java.util.*;

public class assignPanel extends JPanel
{
    private JButton add, edit, delete,assign;
    private JList assigns;
    private JPanel buttons;
    private Vector<Assignment> assignList;
    private addAssignPopUp aAssign; 
    private editAssignPopup eAssign;
    private deletePopup d;
    

   public assignPanel(Instructor loggedInInstr)

    {
	   
        aAssign = new addAssignPopUp(this);        

        assignList = loggedInInstr.getAList();
        
        add = new JButton("Add Assignment");
        add.addActionListener(new addListener());
        
        edit = new JButton("Edit Assignment");
        edit.addActionListener(new editListener());
        
        delete = new JButton("Delete Assignment");
        delete.addActionListener(new DeleteListener());
        
        assign = new JButton("Assign");
        assign.addActionListener(new AssignListener());
        
        assigns = new JList();
        assigns.setListData(assignList);
        
     //   assigns.addActionListener(new updateListener()) ;
        
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,4));
        buttons.add(add);
        buttons.add(edit);
        buttons.add(delete);
        buttons.add(assign);
        
        setLayout(new GridLayout(2,1));
        add(assigns);
        add(buttons);
        assigns.setVisible(true);
        buttons.setVisible(true);
        
    }

	private class addListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			aAssign.setVisible(true);
		}
	}
	
	public Vector<Assignment> getAList(){
		return assignList;
	}
	
	public JList getJList(){
		return assigns;
	}
    
    private class editListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        	
            eAssign = new editAssignPopup(assignList.get(assigns.getSelectedIndex()));
            eAssign.setVisible(true);
        }
    }
    
    private class SelctionListener implements ListSelectionListener{

		public void valueChanged(ListSelectionEvent e) {
			int lastIndex = e.getLastIndex();
						
		}
    	
    }
    
    private class DeleteListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		d = new deletePopup(assignList,assigns.getSelectedIndex());    		
    		d.setVisible(true);
    	}
    }
    
    private class AssignListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		
    	}
    }
    	
    }


