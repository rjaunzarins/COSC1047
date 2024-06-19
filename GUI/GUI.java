package GUI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
    
	public static void main(String args[]){
       
		// Creating Frame
		JFrame frame = new JFrame("Chat Frame");	// Frame to hold contents
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,600);					// Set window size
       frame.setLocation(450, 200);				// Set window location
       
       // Creating the MenuBar and adding components
       JMenuBar mb = new JMenuBar();
       JMenu m1 = new JMenu("File");
       JMenu m2 = new JMenu("Help");
       mb.add(m1);
       mb.add(m2);
       JMenuItem m11 = new JMenuItem("Open");
       JMenuItem m22 = new JMenuItem("Save As");
       m1.add(m11);
       m1.add(m22);
       
       // Creating the panel at bottom and adding components
       JPanel panel = new JPanel();	// The panel is not visible in output
       JLabel label = new JLabel("Enter Text");
       JTextField tf = new JTextField(10); 	// Accepts up to 10 characters
       JButton send = new JButton("Send");
       JButton reset = new JButton("Reset");
       panel.add(label);	// Components added using flow layout
       panel.add(tf);
       panel.add(send);
       panel.add(reset);
       
       // Text Area at the Center
       JTextArea ta = new JTextArea();
       
       // Adding components to the frame
       frame.getContentPane().add(BorderLayout.SOUTH, panel);
       frame.getContentPane().add(BorderLayout.NORTH, mb);
       frame.getContentPane().add(BorderLayout.CENTER, ta);
      
       
       // Creating buttons
       //JButton button1 = new JButton("Button 1");	// Button that can be pressed
       //JButton button2 = new JButton("Button 2");
       //frame.getContentPane().add(button1); 		// Adds Button to content pane of frame
       //frame.getContentPane().add(button2);
       
       
       frame.setVisible(true); 	// Set to visible after creating components
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
