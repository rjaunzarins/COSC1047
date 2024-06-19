package Assignment2;

public class CardGame implements InventoryItem {
	
	private String name;
	private double price;
	private int quantity;
	
	/**
	 * CONSTRUCTOR
	 * @param name The name of the game
	 * @param price The retail price
	 * @param quantity The number in stock
	 */
	public CardGame(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/**
	 * getName Method
	 * @return The game's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * getRetailPrice Method - Overridden from InventoryItem
	 * @return The retail price
	 */
	@Override
	public double getRetailPrice() {
		return price;
	}
	
	/**
	 * getQuantity Method - Overridden from InventoryItem
	 * @return The number in stock
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * setName Method
	 * @param name The name of the game
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * setRetailPrice Method - Overridden from InventoryItem
	 * @param price The retail price
	 */
	@Override
	public void setRetailPrice(double price) {
		this.price = price;
	}
	
	/**
	 * setQuantity Method - Overridden from InventoryItem
	 * @param quantity The number in stock
	 */
	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Card Game[ " + name + ", Retail Price: " + price + ", Quantity in Stock: " + 
				quantity + " ]";
	}
}
