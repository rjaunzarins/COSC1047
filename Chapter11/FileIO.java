package Chapter11;

import java.io.*;


public class FileIO {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//String str = "This is a String.";
		//int[] intArr = { 1, 2, 3, 4, 5, 6, 7 };
		char[] charArr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		boolean EOF = false;
		
		
		try {
			DataOutputStream outFile = new DataOutputStream(new FileOutputStream("Data.dat"));
			for(int i = 0; i < charArr.length; i++) {
				outFile.writeChar(charArr[i]);
			}
			outFile.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			DataInputStream inFile = new DataInputStream(new FileInputStream("Data.dat"));
			try{
				while(!EOF) {
					System.out.print(inFile.readChar() + " ");
				}
				
				inFile.close();
			}
			catch(FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
			catch(EOFException e) {
				EOF = true;
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		EOF = false;
		try {
			ObjectOutputStream outFile = new ObjectOutputStream(new FileOutputStream("Objs.dat"));
			outFile.writeObject(charArr);
			outFile.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		char[] charArray = null;
		try {
			ObjectInputStream inFile = new ObjectInputStream(new FileInputStream("Objs.dat"));
			while(!EOF) {
				charArray = (char[]) inFile.readObject();
				for(int i = 0; i < charArray.length; i++) {
					System.out.print(charArray[i] + " ");
				}
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(ClassNotFoundException exe) {
			System.out.println(exe.getMessage());
		}
		catch(EOFException e) {
			EOF = true;
		}
		catch(Exception exep) {
			System.out.println(exep.getMessage());
		}
	}

}
