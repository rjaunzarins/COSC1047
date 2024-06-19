package Chapter12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RetailPriceCalculator extends JFrame {
	
	private JTextField wholeSale;
	private JTextField markup;
	private JLabel labelW;
	private JLabel labelM;
	private JButton calcButton;
	private JPanel panelW;
	private JPanel panelM;
	private JPanel panelR;
	
	public RetailPriceCalculator() {
		
		setLocation(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		setTitle("RetailPriceCalculator");
		
		wholeSale = new JTextField();
		labelW = new JLabel(" Wholesale Price:");
		markup = new JTextField();
		labelM = new JLabel(" Markup:");
		calcButton = new JButton("Get Retail Price");
		calcButton.addActionListener(new ButtonListener());
		
		panelW = new JPanel();
		panelW.setLayout(new GridLayout(1,2));
		panelM = new JPanel();
		panelM.setLayout(new GridLayout(1,2));
		panelR = new JPanel();
		panelR.setLayout(new GridLayout(1,2));
		
		panelW.add(labelW);
		panelW.add(wholeSale);
		panelM.add(labelM);
		panelM.add(markup);
		panelR.add(calcButton);
		
		add(panelW);
		add(panelM);
		add(panelR);
		pack();
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == calcButton) {
				if(!wholeSale.getText().isEmpty()) {
					if(!markup.getText().isEmpty()) {
						double wholesalePrice = Double.parseDouble(wholeSale.getText());
						double markupPercent = Double.parseDouble(markup.getText()) / 100;
						JOptionPane.showMessageDialog(null, "The retail price is: $" +
								 (wholesalePrice + (wholesalePrice * markupPercent)));
					}
					else 
						markup.setText("Enter a value");
				}
				else {
					wholeSale.setText("Enter a value");
					if(markup.getText().isEmpty())
						markup.setText("Enter a value");
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new RetailPriceCalculator();
	}
}
