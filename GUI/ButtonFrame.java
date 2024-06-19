package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ButtonFrame extends JFrame implements ActionListener{

	static final long serialVersionUID = 123123123;
	JButton button;
	JLabel label;
		
	public ButtonFrame() {
		
		// Image on button
		ImageIcon icon = new ImageIcon("among.png");
		ImageIcon icon2 = new ImageIcon("among.png");
		
		// Button
		button = new JButton();
		button.setBounds(125, 100, 250, 150);
		button.addActionListener(this); 
		//use this is you dont implement actionListener and dont write actionPerformed method
		//button.addActionListener(e -> System.out.println("Button Pressed"));
		button.setText("Press Button");		// Set text on button
		button.setFocusable(false);			// Removes "box" around text on button
		button.setIcon(icon); 				// Add icon
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.TOP);
		button.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button.setIconTextGap(-10);
		button.setForeground(Color.BLACK);
		button.setBackground(Color.RED);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		// Label
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(200,300,100,100);
		label.setVisible(false);
		
		// Frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setLocation(400, 200);
		this.add(button);
		this.add(label);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Button Pressed!");
			// button.setEnabled(false); <-- disables button after one click
			if(label.isVisible())	
				label.setVisible(false);
			else
				label.setVisible(true);
			
			
		}
	}
	
}
