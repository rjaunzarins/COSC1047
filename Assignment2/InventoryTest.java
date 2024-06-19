package Assignment2;

public class InventoryTest {

	public static void main(String[] args) {
		
		System.out.println("Creating a store inventory array of 5 items...");
		System.out.println("Stocking the inventory items ... Printing store inventory:\n");
		
		InventoryItem[] arr = new InventoryItem[5];
		arr[0] = new ComicBook("Superman", 2, 100.0, 2);
		arr[1] = new CardGame("Uno", 9.95, 3);
		arr[2] = new CardGame("Munchkin", 29.95, 10);
		arr[3] = new ComicBook("Buffy The Vampire Slayer", 6, 9.95, 2);
		arr[4] = new ComicBook("X-men", 50, 8.95, 12);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}

		System.out.println("\nAssessing value of in-stock items...\n");
		
		// Total Inventory Quantity
		int items = 0;
		
		for(int i = 0; i < arr.length; i++) {
			items += arr[i].getQuantity();
		}
		
		System.out.println("Total Inventory Quantity (num items): " + items);
		
		// Total Inventory Value
		double value = 0;
		
		for(int i = 0; i < arr.length; i++) {
			value += (arr[i].getRetailPrice() * arr[i].getQuantity());
		}
		
		System.out.println("Total Inventory Value: " + value);
		
		// Max Value
		double maxValue = (arr[0].getRetailPrice() * arr[0].getQuantity());
		int maxElem = 0;
		for(int i = 0; i < arr.length; i++) {
			if((arr[i].getRetailPrice() * arr[i].getQuantity()) > maxValue) {
				maxElem = i;
				maxValue = (arr[i].getRetailPrice() * arr[i].getQuantity());
			}
		}
		System.out.println("Inventory Item with Max Value of " + maxValue + " is: " + arr[maxElem].toString());
		
		// Min Value
		double minValue = (arr[0].getRetailPrice() * arr[0].getQuantity());
		int minElem = 0;
		for(int i = 0; i < arr.length; i++) {
			if((arr[i].getRetailPrice() * arr[i].getQuantity()) < minValue) {
				minElem = i;
				minValue = (arr[i].getRetailPrice() * arr[i].getQuantity());
			}
		}
		System.out.println("Inventory Item with Min Value of " + minValue + " is: " + arr[minElem].toString());
		
		
	}

}
