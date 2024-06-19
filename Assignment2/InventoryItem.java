package Assignment2;

public interface InventoryItem {

	// Return the quantity of the item currently in stock
	public int getQuantity();
	
	// Get the price of an individual item
	public double getRetailPrice();
	
	// Change the quantity of an item absolutely
	public void setQuantity(int quantity);
	
	// Adjust the retail price of an item
	public void setRetailPrice(double price);
}
