package Assignment1;

import java.util.ArrayList;

public class Hero {
	
	private String name;
	private int health;
	private int maxItems;
	private ArrayList<String> items;
	
	/**
	 * No-Arg CONSTRUCTOR
	 */
	public Hero() {
		
		this.name = "Anonymous";
		this.health = 100;
		this.maxItems = 2;
		this.items = new ArrayList<>(maxItems);
	}
	
	/**
	 * CONSTRUCTOR
	 * @param name
	 * @param maxItems
	 */
	public Hero(String name, int maxItems) {
		this.name = name;
		this.health = 100;
		if(maxItems >= 0 && maxItems <= 10)
			this.maxItems = maxItems;
		else
			this.maxItems = 5;
		this.items = new ArrayList<>(maxItems);
	}
	
	/**
	 * inventory Method
	 * @return The contents of Hero's backpack as a String
	 */
	public String inventory() {
		String storedItems = "";
		for(int i = 0; i < this.items.size(); i++) {
			if(i < items.size()-1)	
				storedItems += this.items.get(i) + ", ";
			else
				storedItems += this.items.get(i);
		}
		if(storedItems == "")
			storedItems = "Your hero is unburdened by worldly possessions.";
		return storedItems;
	}
	
	/**
	 * take Method
	 * @param item The item to add to inventory
	 */
	public void take(String item) {
		if(items.size() < maxItems)
			this.items.add(item); 
		else
			System.out.println(name + " is overburdened and cannot carry any more...");
	}
	
	/**
	 * drop Method
	 * @param item The item to drop
	 */
	public void drop(String item) {
		boolean carrying = false;
		for(int i = 0; i < items.size(); i++) {
			if(items.get(i) == item) {
				carrying = true;
				items.remove(i);
				System.out.println("Dropped " + item);
			}
		}
		if(carrying == false)
			System.out.println(this.name + " is not carrying that item - " + item);		
	}
	
	/**
	 * takeDamage Method
	 * @param damage The amount to reduce health
	 */
	public void takeDamage(int damage) {
		if((this.health -= damage) >= 0)
			this.health -= damage;
		else
			this.health = 0;
	}
	
	/**
	 * heal Method
	 * @param health The amount of health to add
	 */
	public void heal(int health) {
		if((this.health += health) <= 100) {
		}
		else
			this.health = 100;
	}
	
	/**
	 * getName Method
	 * @return The Hero's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * getHealth Method
	 * @return The Hero's current health
	 */
	public int getHealth() {
		return this.health;
	}
	
	/**
	 * toString Method
	 */
	public String toString() {
		return "Hero: " + this.name + ", Health: " + this.health +
				", Can carry: " + this.maxItems + " items, Current Inventory: " +
				inventory();
	}
	
}
