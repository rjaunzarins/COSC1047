package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutManager {

	public static void main(String[] args) {
		
		// Layout Manager = Defines the natural layout for components within a container
		
		// 3 Common Managers
		
		// Border Layout = places components in five areas: NORTH, SOUTH, EAST, WEST, CENTER
		//				   all extra space is placed in the center area
		
		// Create Frame
		JFrame frame = new JFrame();
		frame.setLocation(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));
		
		// Create 5 panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		// Give each panel a different color
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		// Set size for each panel
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		// Add to panel
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.SOUTH);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.WEST);
		frame.add(panel5,BorderLayout.CENTER);
		
		// Create border layout for panel 5
		panel5.setLayout(new BorderLayout(5,5));
		
			//--------- Sub Panels ---------//
			
			// Create 5 sub panels
			JPanel subPanel1 = new JPanel();
			JPanel subPanel2 = new JPanel();
			JPanel subPanel3 = new JPanel();
			JPanel subPanel4 = new JPanel();
			JPanel subPanel5 = new JPanel();
	
			// Give each sub panel a different color
			subPanel1.setBackground(Color.black);
			subPanel2.setBackground(Color.darkGray);
			subPanel3.setBackground(Color.gray);
			subPanel4.setBackground(Color.lightGray);
			subPanel5.setBackground(Color.white);
			
			// Set size for each sub panel
			subPanel1.setPreferredSize(new Dimension(50,50));
			subPanel2.setPreferredSize(new Dimension(50,50));
			subPanel3.setPreferredSize(new Dimension(50,100));
			subPanel4.setPreferredSize(new Dimension(50,100));
			subPanel5.setPreferredSize(new Dimension(50,50));
			
			// Add to sub panel
			panel5.add(subPanel1,BorderLayout.NORTH);
			panel5.add(subPanel2,BorderLayout.SOUTH);
			panel5.add(subPanel3,BorderLayout.EAST);
			panel5.add(subPanel4,BorderLayout.WEST);
			panel5.add(subPanel5,BorderLayout.CENTER);
			
		
		
		// Set to visible last
		frame.setVisible(true);
		frame.setResizable(true);
		
		
	}

}
