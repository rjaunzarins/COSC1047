package Review;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
	
	JButton btn;
	JPanel pn1;
	
	public GUI() {
		
		buildFrame();
		buildPanel();
		
		add(pn1);
		pack();
		setVisible(true);
	}
	
	public void buildFrame() {
		setLocation(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Color Changer");
	}
	
	public void buildPanel() {
		btn = new JButton("Change Background");
		btn.addActionListener(new ButtonListener());
		pn1 = new JPanel();
		pn1.setBackground(Color.red);
		pn1.add(btn);
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				if(pn1.getBackground() == Color.red)
					pn1.setBackground(Color.BLACK);
				else
				pn1.setBackground(Color.red);
			}
		}
	}
	
	public static void main(String[] args) {
		new GUI();
	}
}
