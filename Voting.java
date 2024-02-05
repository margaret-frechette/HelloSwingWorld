import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

/**
   A "Hello, World" program for Java Swing run as a Java application,
   modified to have the class implement the Runnable interface rather
   than creating the Runnable as an anonymous class.

   @author Jim Teresco
   @version Spring 2020
*/

public class Voting implements Runnable {

    /**
       The run method to set up the graphical user interface

    */
    @Override
    public void run() {
	
	// set up the GUI "look and feel" which should match
	// the OS on which we are running
	JFrame.setDefaultLookAndFeelDecorated(false);
	
	// create a JFrame in which we will build our very
	// tiny GUI, and give the window a name
	JFrame frame = new JFrame("Voting");

	

	// sets the size of the frame 
	frame.setPreferredSize(new Dimension(500,500));

	
	// tell the JFrame that when someone closes the
	// window, the application should terminate
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel panel = new JPanel(new BorderLayout());
	frame.add(panel);

    JPanel panel2 = new JPanel(new GridLayout(2,1));
    JPanel panel3 = new JPanel(new FlowLayout());

    panel.add(panel2,BorderLayout.CENTER);
   
    panel.add(panel3,BorderLayout.SOUTH);
    
    JPanel panel4 = new JPanel(new FlowLayout());
    JPanel panel5 = new JPanel(new FlowLayout());


    panel2.add(panel4);
    panel2.add(panel5);

    JLabel label = new JLabel("Label");
    JLabel label2 = new JLabel("Label2");

    
    panel.add(label,BorderLayout.CENTER);
    panel.add(label2);

	// display the window we've created
	frame.pack();
	frame.setVisible(true);
    }
    
    public static void main(String args[]) {

	// The main method is responsible for creating a thread (more
	// about those later) that will construct and show the graphical
	// user interface.
	javax.swing.SwingUtilities.invokeLater(new Voting());
    }
}

