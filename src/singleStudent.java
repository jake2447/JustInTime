import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class singleStudent extends JFrame
{
    private prevAssignPanel prev;
       
    public singleStudent(Student logStud, Members mem)
    {       
    		
            prev = new prevAssignPanel(logStud,mem);
            prev.setVisible(true);
            add(prev);
            setSize(1024,768);
    }
}
