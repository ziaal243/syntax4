import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first{

    public static JFrame frame = new JFrame("Chat Frame");

    public static void Frame(JFrame frame) {
        //JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        
        // Menu 
        JMenuBar MenuBar1 = new JMenuBar();
        JMenu M1 = new JMenu("FILE");
        JMenu M2 = new JMenu("HELP");
        MenuBar1.add(M1);
        MenuBar1.add(M2);
        
        JMenuItem M11 = new JMenuItem("OPEN");
        JMenuItem M22 = new JMenuItem("SAVE AS");
        
        M1.add(M11);
        M1.add(M22);
        M2.add(M11);
        M2.add(M22);
        
        // Panel 1
        JPanel P1 = new JPanel();
        JLabel L1 = new JLabel("ENTER TEXT");
        JTextField T1 = new JTextField(10);
        JButton Send = new JButton("SEND");
        JButton Reset = new JButton("RESET");

        P1.add(L1);
        P1.add(T1);
        P1.add(Send);
        P1.add(Reset);

        // Panel 2
        JPanel P2 = new JPanel();
        JButton B1 = new JButton("Hi");
        JCheckBox CB1 = new JCheckBox("Hi");
        P2.add(B1);
        P2.add(CB1);

        // Text in the middle 
        JTextArea TA1 = new JTextArea();

        // Adding Comp to frame 
        frame.getContentPane().add(BorderLayout.SOUTH, P1);
        frame.getContentPane().add(BorderLayout.NORTH, MenuBar1);
        frame.getContentPane().add(BorderLayout.CENTER, TA1);
        // frame.pack();
        frame.setVisible(true);       

        

    }
    
    
    public static void main(String args[]){
        Frame(frame);

    }
}

/*
Panel: It is a pure container and is not a window in itself. The sole purpose of a Panel is to organize the components on to a window.
Frame: It is a fully functioning window with its title and icons.
Dialog: It can be thought of like a pop-up window that pops out when a message has to be displayed. It is not a fully functioning window like the Frame.
 */