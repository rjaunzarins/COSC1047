package GUI;
import java.awt.*;
import javax.swing.*;

public class TEST {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setLocation(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(10,10));
		
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel1.setPreferredSize(new Dimension(100,100));
		
		frame.add(panel1,BorderLayout.NORTH);
		panel1.setVisible(true);

		frame.setVisible(true);
	}

}
