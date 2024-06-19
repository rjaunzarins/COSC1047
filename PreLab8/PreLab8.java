package PreLab8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

/**
 * PreLab8 Class - extends JFrame
 * Creates GUI which allows conversions from
 * kilometers to feet or miles
 * @author rhy
 */
public class PreLab8 extends JFrame implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label1;
	private JLabel label2;
	private JTextField kiloText;
	private JTextArea textArea;
	private JRadioButton feetButton;
	private JRadioButton milesButton;
	private ButtonGroup buttonGroup;
	
	/**
	 * CONSTRUCTOR
	 */
	public PreLab8() {
		
		setLocation(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		setTitle("KiloConverter");
		setResizable(false);
		
		// Instantiate objects
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		label1 = new JLabel("Enter Kilometers: ");
		label2 = new JLabel("Converts to: ");
		kiloText = new JTextField(15);
		//kiloText.setToolTipText("Enter number of kilometers to convert");
		kiloText.addKeyListener(new KeyboardListener());
		//kiloText.setFocusable(true);
		feetButton = new JRadioButton("Feet", true);
		feetButton.setSelected(true);
		//feetButton.setToolTipText("Convert to feet");
		feetButton.addActionListener(new RadioButtonListener());
		milesButton = new JRadioButton("Miles");
		//milesButton.setToolTipText("Convert to miles");
		milesButton.addActionListener(new RadioButtonListener());
		textArea = new JTextArea(1,15);
		//textArea.setToolTipText("Your conversion here");
		
		// Button group
		buttonGroup = new ButtonGroup();
		buttonGroup.add(feetButton);
		buttonGroup.add(milesButton);
		
		// Add to panels
		panel1.add(label1);
		panel1.add(kiloText);
		panel2.add(feetButton);
		panel2.add(milesButton);
		panel3.add(label2);
		panel3.add(textArea);
		textArea.setText("0 Feet");
		
		// Add to frame and setVisible
		add(panel1);
		add(panel2);
		add(panel3);
		pack();
		setVisible(true);
	}
	
	/**
	 * KeyboardListener Class - implements KeyListener
	 * Used with textArea to listen for keyboard presses
	 */
	private class KeyboardListener implements KeyListener {
	
		@Override
		public void keyTyped(KeyEvent e) {
		}
	
		/**
		 * keyPressed Method
		 * @param e The KeyEvent from the textArea
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			// try to get text from kiloText
			try {	
				// If source is kiloText
				if(e.getSource() == kiloText) {
					String chars = "";
					// When kiloText is source and feetButton is selected
					if(feetButton.isSelected()) {
						// If backspace is pressed -> correct for removed character
						if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
							for(int i = 0; i < kiloText.getText().length() - 1; i++ ) {
								chars += String.valueOf(kiloText.getText().charAt(i));
							}
							textArea.setText(String.format("%,.2f Feet",(Double.parseDouble(chars) * 3280.84)));
							System.out.println("Feet button - backspace");
						}
						// else add the key pressed to the contents of kiloText
						else {
						textArea.setText(String.format("%,.2f Feet",(Double.parseDouble(kiloText.getText() + e.getKeyChar()) * 3280.84)));
						System.out.println("Feet button - add key");
						}
					}
					// When kiloText is source and milesButton is selected
					if(milesButton.isSelected()) {
						// If backspace is pressed -> correct for removed character
						if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
							for(int i = 0; i < kiloText.getText().length() - 1; i++ ) {
								chars += String.valueOf(kiloText.getText().charAt(i));
							}
							textArea.setText(String.format("%,.2f Miles",(Double.parseDouble(chars) * 0.621371)));
							System.out.println("Miles button - Backspace");
						}
						// else add the key pressed to the contents of kiloText
						else {
							textArea.setText(String.format("%,.2f Miles",(Double.parseDouble(kiloText.getText() + e.getKeyChar()) * 0.621371)));
							System.out.println("Miles button - add key");
						}
					}
				}
			}
			// catch - no text to get
			catch(NumberFormatException ex) {
				// If no text - feetButton is selected
				if(feetButton.isSelected())	{
					textArea.setText("0 Feet");
					System.out.println("Catch Feet - no input");
				}
				// If no text - miles button is selected
				else if(milesButton.isSelected()) {
					textArea.setText("0 Miles");
					System.out.println("Catch Miles - no input");
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
	
	/**
	 * RadioButtonListener Class - implements ActionListener
	 * interacts with JRadioButtons
	 */
	private class RadioButtonListener implements ActionListener {
		
		/**
		 * actionPerformed Method
		 * @param e The ActionEvent from a RadioButton
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			
			// If feet button is clicked
			if(e.getSource() == feetButton) {
				// If kiloText isEmpty
				if(kiloText.getText().isEmpty()) {
					textArea.setText("0 Feet");
					System.out.println("Feet button - isEmpty");
				}	
				// If kiloText is not empty
				else {
					textArea.setText(String.format("%,.2f Feet",(Double.parseDouble(kiloText.getText()) * 3280.84)));
					System.out.println("Feet button - not empty");
				}	
			}
			
			// If milesButton is clicked
			if(e.getSource() == milesButton) {
				// If kiloText isEmpty
				if(kiloText.getText().isEmpty()) {
					textArea.setText("0 Miles");
					System.out.println("Miles Button - isEmpty");
				}	
				// If kiloText is not empty
				else {	
					textArea.setText(String.format("%,.2f Miles",(Double.parseDouble(kiloText.getText()) * 0.621371)));
					System.out.println("Miles Button - not empty");
				}	
			}
		}
		
	}
	
	/**
	 * main Method
	 * @param args
	 */
	public static void main(String[] args) {
		new PreLab8();
	}

}
