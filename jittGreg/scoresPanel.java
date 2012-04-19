import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class scoresPanel extends JPanel
{
    private JTabbedPane tabs;
    private assignScores aScore;
    private studentScores sScores;
    
    private JPanel viewAssign, viewStudents;
    
    public scoresPanel()
    {
        tabs = new JTabbedPane();
        aScore = new assignScores();
        sScores = new studentScores();
        tabs.addTab("List Assignments", aScore);
        tabs.addTab("List Students",sScores);
        setLayout(new GridLayout(1,1));
        this.setSize(400,200);
        add(tabs);
        setVisible(true);
    }
    
}
