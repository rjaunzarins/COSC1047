package PreLab9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Lab7 Class - extends JFrame
 * Creates a GUI that interacts with the DynamicArray class
 * Add button creates and adds an integer to Dynamic array
 * and displays in in a JLabel. Pop removes the last element
 * from the array and displays the updated array
 * @author Rhy Jaunzarins
 *
 */
public class PreLab9 extends JFrame {
		
	JPanel panelTop;
	JPanel panelMid;
	JPanel panelBot;
	JLabel addNumLabel;
	JTextArea printArea;
	JScrollPane scrollPane;
	JButton addButton;
	JButton popButton;
	JTextField textField;
	DynamicArray arr;
	
	/**
	 * CONSTRUCTOR
	 * Creates the GUI object. 
	 */
	public PreLab9() {
		
		// Set frame properties
		setLocation(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		setSize(500,300);
		setTitle("ArraysGraphically");
		setResizable(true);
		
		// Set panel features - Panel 1 and add to panel1
		panelTop = new JPanel();
		addNumLabel = new JLabel("Add a number: ");
		addButton = new JButton("Add");
		textField = new JTextField(10);
		textField.addKeyListener( new KeyboardListener());
		addButton.addActionListener(new ButtonListener());
		panelTop.add(addNumLabel);
		panelTop.add(textField);
		panelTop.add(addButton);
		
		panelMid = new JPanel();
		popButton = new JButton("Pop");
		popButton.addActionListener(new ButtonListener());
		panelTop.add(popButton);
		
		// Set panel2 and add printLabel
		panelBot = new JPanel();
		printArea = new JTextArea(5,25);
		printArea.setEditable(false);
		printArea.setLineWrap(true);
		printArea.setWrapStyleWord(true);
		scrollPane = new JScrollPane(printArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		panelBot.add(scrollPane);
		
		// Add panels to frame and setVisible
		add(panelTop);
		add(panelBot);
		pack();
		setVisible(true);
	}
	
	/**
	 * ButtonListener Class - implements ActionListener
	 */
	private class ButtonListener implements ActionListener {
		
		/**
		 * actionPerformed Method
		 * @param ActionEvent e
		 */
		public void actionPerformed(ActionEvent e) {
			
			// Add Button
			if(e.getSource() == addButton) {
				if(!textField.getText().isEmpty()  ) {	
					if(arr == null)	
						arr = new DynamicArray();
					arr.pushBack(Integer.parseInt(textField.getText()));
					textField.setText("");
					printArea.append((arr.getValue(arr.getNumItems()-1)) + "\n");
				}
				else
					printArea.setText("Enter a value");
			}
			
			// Pop Button
			else if(e.getSource() == popButton) {
				if(arr == null)
					printArea.setText("Array is empty");
				else if(arr.getNumItems() == 0)
					printArea.setText("Array is empty");
				else {
					arr.popBack();
					printArea.setText("");
					for(int i = 0; i < arr.getNumItems(); i++) {
						printArea.append(arr.getValue(i) + "\n");
					}
				}
			}
		}
	}
	
	/**
	 * KeyboardListener class to listen for VK_ENTER press
	 * implements KeyListener
	 * @author rhy
	 */
	private class KeyboardListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
		}
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getSource() == textField) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					addButton.doClick();
				}
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
	
	/**
	 * main Method
	 * @param args
	 */
	public static void main(String[] args) {
		new PreLab9();
	}
}

