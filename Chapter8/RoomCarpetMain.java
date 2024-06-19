package Chapter8;

import java.util.Scanner;

public class RoomCarpetMain {

	public static void main(String[] args) {
		
		 Scanner keyb = new Scanner(System.in);
		 System.out.print("Enter length of room: ");
		 double length = keyb.nextDouble();
		 System.out.print("Enter width of room: ");
		 double width = keyb.nextDouble();
		 System.out.print("Enter cost per sq ft for carpet: ");
		 double cost = keyb.nextDouble();
		 
		 RoomDimension dimension = new RoomDimension(length, width);
		 RoomCarpet carpet = new RoomCarpet(dimension, cost);
		 
		 System.out.println(dimension.toString());
		 System.out.println(carpet.toString());
		 
		 keyb.close();
		 System.out.println("Done");
	}

}
