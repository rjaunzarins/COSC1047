package GUI;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		// ImageIcon
		ImageIcon image = new ImageIcon("mega.png");
		Border border = BorderFactory.createLineBorder(Color.white, 3);
		
		// Label
		JLabel label = new JLabel();	// Create label
		label.setIcon(image);
		label.setText("Label");			// Set text of label
		label.setHorizontalTextPosition(JLabel.CENTER); 	// Can use LEFT, CENTER, RIGHT - Relative to image
		label.setVerticalTextPosition(JLabel.TOP); 			// Can use TOP, CENTER, BOTTOM - relative to image
		label.setHorizontalAlignment(JLabel.CENTER);		// Can use LEFT, CENTER, RIGHT - image and text
		label.setVerticalAlignment(JLabel.CENTER);			// Can use TOP, CENTER, BOTTOM - image and text
		label.setFont(new Font("MV Boli", Font.PLAIN, 40)); // Set the font style
		label.setForeground(new Color(255,0,0));			// Change color of font
		label.setIconTextGap(-25); 							// Set gap of text to image
		label.setBackground(Color.black); 					// Sets background color
		label.setOpaque(true); 								// Display background color
		label.setBorder(border);
		//label.setBounds(0, 0, 250, 250);		// Set x & y position within frame
		
		// Frame
		this.setTitle("JFrame Title Goes Here"); 	// Sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// Exit out of application on close
		this.setResizable(true); 		// Prevent frame from being resized
		//this.setSize(800, 800);			// Sets the x dimension and y dimension
		//this.setLayout(null);			// use to allow label to be moved around
		this.setLocation(450, 200);		// Sets the location of frame
		this.add(label);				// add label
		this.setVisible(true); 			// Make Frame visible
		this.pack();
		
		
		
		/*
		ImageIcon image = new ImageIcon("filename.png");	// Creates an ImageIcon
		this.setIconImage(image.getImage()); 				// Change icon on frame
		//frame.getContentPane().setBackground(Color.green); 	// Change color of background
		//frame.getContentPane().setBackground(0x123456); 	// Change color of background (hexadecimal)
		this.getContentPane().setBackground(new Color(120,013,255)); 	// Change color of background (RGB)
		*/
	
	}
	
}
