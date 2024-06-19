package Chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlgorithmWorkbench2 extends JFrame {

	JPanel panel;
	JPanel panel2;
	JButton button;
	JRadioButton b1;
	JRadioButton b2;
	JRadioButton b3;
	ButtonGroup group;
	
	public AlgorithmWorkbench2(){
		
		setLocation(500,300);
		setLayout(new GridLayout(5,10));
		setSize(500,500);
		
		b1 = new JRadioButton("Option 1", true);
		b2 = new JRadioButton("Option 2");
		b3 = new JRadioButton("Option 3");
		group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		button = new JButton("Button");
		button.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
		panel = new JPanel();
		panel2 = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(button,BorderLayout.CENTER);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		
		add(panel2);
		add(panel);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new AlgorithmWorkbench2();
	}
}
