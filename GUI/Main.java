package GUI;

public class Main {

	public static void main(String[] args) {
		
		/*
		// JFrame = a GUI window to add components to
		JFrame frame = new JFrame();	// Creates Frame
		frame.setTitle("JFrame Title Goes Here"); 	// Sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// Exit out of application on close
		frame.setResizable(false); 		// Prevent frame from being resized
		frame.setSize(400, 400);		// Sets the x dimension and y dimension
		frame.setVisible(true); 		// Make Frame visible
		
		ImageIcon image = new ImageIcon("filename.png");	// Creates an ImageIcon
		frame.setIconImage(image.getImage()); 				// Change icon on frame
		//frame.getContentPane().setBackground(Color.green); 	// Change color of background
		//frame.getContentPane().setBackground(0x123456); 	// Change color of background (hexadecimal)
		frame.getContentPane().setBackground(new Color(120,013,255)); 	// Change color of background (RGB)
		*/
		
		MyFrame myFrame = new MyFrame();
		//new MyFrame(); Can also just use this if name is not needed

	}

}
