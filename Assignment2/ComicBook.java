package Assignment2;

public class ComicBook implements InventoryItem {
	
	private String title;
	private int issue;
	private double price;
	private int quantity;
	
	/**
	 * CONSTRUCTOR
	 * @param title The title of the ComicBook
	 * @param issue The issue number
	 * @param price The price
	 * @param stock The number in stock
	 */
	public ComicBook(String title, int issue, double price, int stock) {
		this.title = title;
		this.issue = issue;
		this.price = price;
		this.quantity = stock;
	}
	
	/**
	 * getTitle Method
	 * @return The title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * getIssue Method
	 * @return The issue number
	 */
	public int getIssue() {
		return issue;
	}
	
	/**
	 * getRetailPrice Method - Overridden from InventoryItem
	 * @return Retail price
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
	 * setTitle MEthod
	 * @param title The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * setIssue method
	 * @param issue The issue number
	 */
	public void setIssue(int issue) {
		this.issue = issue;
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
	 * @param stock The quantity in stock
	 */
	@Override
	public void setQuantity(int stock) {
		this.quantity = stock;
	}
	
	public String toString() {
		return "Comic Book[ " + title + ", Issue " + issue + ", Retail Price: " + price + 
			   ", Quantity in Stock: " + quantity + " ]";
	}
	
	
}
