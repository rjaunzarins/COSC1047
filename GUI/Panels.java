package GUI;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {

	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon = new ImageIcon("among.png");
		
		JLabel label = new JLabel();
		//label.setText("Hello");
		label.setIcon(icon);
		//label.setVerticalAlignment(JLabel.CENTER);
		//label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(100, 100, 100, 100);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 200, 200);
		
		JPanel bluPanel = new JPanel();
		bluPanel.setBackground(Color.blue);
		bluPanel.setBounds(200, 0, 200, 200);
		
		JPanel grnPanel = new JPanel();
		grnPanel.setBackground(Color.green);
		grnPanel.setBounds(0, 200, 400, 200);
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(800, 800);
		frame.setVisible(true);
		redPanel.add(label);
		frame.add(redPanel);		// Add redPanel to frame
		frame.add(bluPanel);		// Add bluPanel to frame
		frame.add(grnPanel);		// Add grnPanel to frame
		frame.setLocation(450, 100);		// Sets the location of frame
		
		
	}

}
