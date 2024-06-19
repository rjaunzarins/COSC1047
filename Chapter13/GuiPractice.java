package Chapter13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class GuiPractice extends JFrame {
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenuItem openItem;
	JPanel panel1;
	JPanel panel2;
	JButton button;
	JRadioButton rB1;
	JRadioButton rB2;
	ButtonGroup bg;
	JLabel label;
	JTextArea textArea;
	JCheckBox cb1;
	JCheckBox cb2;
	
	public GuiPractice() {
		
		buildFrame();
		buildPanels();
		buildMenuBar();
		
		add(panel1);
		add(panel2);
		add(menuBar);
		setJMenuBar(menuBar);
		pack();
		setVisible(true);
	}
	
	private void buildFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUIPractice");
		setLocation(500,300);
		setLayout(new GridLayout(2,0));
		//setSize(500,500);
		setResizable(false);
		
	}
	
	private void buildPanels() {
		panel1 = new JPanel();
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setBorder(BorderFactory.createTitledBorder("Panel1"));
		button = new JButton("Click Me");
		button.addActionListener(new ButtonListener());
		rB1 = new JRadioButton("Yes", true);
		rB2 = new JRadioButton("No");
		bg = new ButtonGroup();
		bg.add(rB1);
		bg.add(rB2);
		label = new JLabel("Enter text");
		textArea = new JTextArea(3,10);
		textArea.addKeyListener(new KeyboardListener());
		panel1.add(button);
		panel1.add(rB1);
		panel1.add(rB2);
		panel1.add(label);
		panel1.add(textArea);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder("Panel2"));
		panel2.setBackground(Color.lightGray);
		cb1 = new JCheckBox("Blue");
		cb1.addActionListener(new CheckBoxListener());
		cb2 = new JCheckBox("Red");
		cb2.addActionListener(new CheckBoxListener());
		panel2.add(cb1);
		panel2.add(cb2);
	}
	
	private void buildMenuBar() {
		menuBar = new JMenuBar();
		buildFileMenu();
		menuBar.add(fileMenu);
	}
	
	private void buildFileMenu(){	
		openItem = new JMenuItem("Open");
		fileMenu = new JMenu("File");
		fileMenu.add(openItem);	
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				if(rB1.isSelected())
					rB2.doClick();
				else
					rB1.doClick();
			}
		}
	}
	
	private class KeyboardListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getSource() == textArea) {
				if(textArea.getText().equalsIgnoreCase("Click yes")) {
					rB1.doClick();
				}
				else if(textArea.getText().equalsIgnoreCase("Click No")) {
					rB2.doClick();
				}
			}	
		}

		@Override
		public void keyReleased(KeyEvent e) {	
		}
	}
	
	private class CheckBoxListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cb1) {
				if(cb1.isSelected()) {
					if(cb2.isSelected())
						panel2.setBackground(Color.MAGENTA);
					else
						panel2.setBackground(Color.BLUE);
				}
				else {
					if(cb2.isSelected())
						panel2.setBackground(Color.RED);
					else
						panel2.setBackground(Color.LIGHT_GRAY);
				}
			}
			
			if(e.getSource() == cb2) {
				if(cb2.isSelected()) {
					if(cb1.isSelected())
						panel2.setBackground(Color.MAGENTA);
					else
						panel2.setBackground(Color.RED);
				}
				else {
					if(cb1.isSelected())
						panel2.setBackground(Color.BLUE);
					else
						panel2.setBackground(Color.LIGHT_GRAY);
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		new GuiPractice();
	}
}
