package PreLab7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PreLab7Main extends JFrame {
	
	
	JPanel panel;
	JLabel addNumLabel;
	JButton addButton;
	JButton popButton;
	JTextField textField;
	JTextArea textOut;
	DynamicArray arr;
	
	public PreLab7Main() {
		
		// Set frame properties
		setLocation(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,175);
		setLayout(new GridLayout(2, 3));
		setTitle("ArraysGraphically");
		setResizable(false);
		
		// Set panel features - Panel 1
		panel = new JPanel();
		addNumLabel = new JLabel("Add a number: "); 
		addButton = new JButton("Add");
		textField = new JTextField(5);
		textOut = new JTextArea(1, 10);
		textOut.setEditable(false);
		textOut.setLineWrap(true);
		addButton.addActionListener(new ButtonListener());
	
		// Add to panel 1
		panel.add(addNumLabel);
		panel.add(textField);
		panel.add(addButton);
		
		// Set panel 2 features
		JPanel panel2 = new JPanel();
		popButton = new JButton("Pop");
		popButton.addActionListener(new ButtonListener());
		panel2.add(popButton);
		panel2.add(textOut);
		textOut.setVisible(false);
		
		// Add panels to frame and setVisible
		add(panel);
		add(panel2);
		setVisible(true);
		
		
		
	}
	private class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == addButton) {
				
				if(!textField.getText().isEmpty()  ) {	
					if(arr == null)	
						arr = new DynamicArray();
					arr.pushBack(Integer.parseInt(textField.getText()));
					textOut.append("Button Pressed\n" + textField.getText() + "\n");
					//arr.pushBack(String.valueOf(textField.getText()));
					textField.setText("");
				}
				else
					System.out.println("*");
			}
			else if(e.getSource() == popButton) {
				System.out.println("Pop button pressed");
				arr.popBack();
				System.out.println(arr.toString());
			}
			
		}
	}
	public static void main(String[] args) {
		PreLab7Main gui = new PreLab7Main();
	}
}
