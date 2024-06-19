package Chapter11;

import java.io.*;

public class HeroTest {

	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		Hero h2;
		
		try {
			ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream("objects.dat"));
			fileOut.writeObject(h1);
			fileOut.close();
			
			ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream("objects.dat"));
			h2 = (Hero)fileIn.readObject();
		}
		catch(FileNotFoundException e) {
			
		}
		catch(IOException e) {
			
		}
		catch(Exception e) {
			
		}
	}

}
