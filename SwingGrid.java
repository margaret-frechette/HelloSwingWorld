import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridLayout;

/**
   A "Hello, World" program for Java Swing run as a Java application,
   modified to have the class implement the Runnable interface rather
   than creating the Runnable as an anonymous class.

   @author Jim Teresco
   @version Spring 2020
*/

public class SwingGrid implements Runnable {

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
	JFrame frame = new JFrame("SwingBasics");

	

	// sets the size of the frame 
	frame.setPreferredSize(new Dimension(500,500));

	
	// tell the JFrame that when someone closes the
	// window, the application should terminate
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// create a JLabel containing our message, and add
	// it to our JFrame
	JLabel label1 = new JLabel("Swing is Fun");
	JLabel label2 = new JLabel("Fun is Swing");
	JLabel label3 = new JLabel("is Swing fun");
	JLabel label4 = new JLabel("Fun is Swing");
	JLabel label5 = new JLabel("is Swing fun");
	JLabel label6 = new JLabel("Swing is Fun");

	JPanel panel = new JPanel(new GridLayout(3,2));
	frame.add(panel);

	label1.setForeground(Color.magenta);
	panel.add(label1);

	label2.setForeground(Color.pink);
	panel.add(label2);

	label3.setForeground(Color.blue);
	panel.add(label3);
	
    label4.setForeground(Color.yellow);
	panel.add(label4);

	label5.setForeground(Color.red);
	panel.add(label5);

	label6.setForeground(Color.black);
	panel.add(label6);


	// display the window we've created
	frame.pack();
	frame.setVisible(true);
    }
    
    public static void main(String args[]) {

	// The main method is responsible for creating a thread (more
	// about those later) that will construct and show the graphical
	// user interface.
	javax.swing.SwingUtilities.invokeLater(new SwingGrid());
    }
}
