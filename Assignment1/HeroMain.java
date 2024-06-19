package Assignment1;

public class HeroMain {

	public static void main(String[] args) {
		
		System.out.println("----------Creating Heros----------");
		
		// Create hero with no-arg constructor
		System.out.println("Creating a hero with no name.");
		Hero unnamed = new Hero();
		System.out.print("Displaying hero: " + unnamed.toString() + "\n");
		
		// Create hero with name
		System.out.println("Creating a hero with a name.");
		Hero robin = new Hero("Brave Sir Robin", 3);
		System.out.print("Displaying hero: " + robin.toString() + "\n");
		
		
		
		// Testing methods
		System.out.println();
		System.out.println("----------Testing methods----------");
		
		// Add sword
		System.out.println("Handing Sir Robin a sword.");
		robin.take("sword");
		System.out.println("Displaying inventory: " + robin.inventory());
		
		// Add spoon
		System.out.println("Handing Sir Robin a spoon.");
		robin.take("spoon");
		System.out.println("Displaying inventory: " + robin.inventory());
		
		// Add cape
		System.out.println("Handing Sir Robin a cape of good fortune.");
		robin.take("cape of good fortune");
		System.out.println("Displaying inventory: " + robin.inventory());
		
		// Attempt to add too many items
		System.out.println("Handing Sir Robin a tomato.");
		robin.take("tomato");
		System.out.println("Displaying inventory: " + robin.inventory());
	
		// Remove spoon
		System.out.println("Sir Robin drops his spoon.");
		robin.drop("spoon");
		System.out.println("Displaying inventory: " + robin.inventory());
		
		// Remove an item hero is not carrying
		System.out.println("Sir Robin drops his watch.");
		robin.drop("watch");
		System.out.println("Displaying inventory: " + robin.inventory());
		
		// Remove sword
		System.out.println("Sir Robin drops his sword.");
		robin.drop("sword");
		System.out.println("Displaying inventory: " + robin.inventory());		
	
		// Remove cape
		System.out.println("Sir Robin drops his cape of good fortune.");
		robin.drop("cape of good fortune");
		System.out.println("Displaying inventory: " + robin.inventory());
		
		// Remove an item hero is not carrying
		System.out.println("Sir Robin drops his bravery.");
		robin.drop("bravery");
		System.out.println("Displaying inventory: " + robin.inventory());

		// Add another item
		System.out.println("Handing Sir Robin a pointy hat.");
		robin.take("pointy hat");
		System.out.println("Displaying inventory: " + robin.inventory());	
		
		
		
		// Damage and healing section
		
		// Take Damage
		System.out.println(robin.getName() + " is so busy worrying about his inventory he doesn't notice the danger and " +
						   "takes 50 damage from a shrubery!");
		robin.takeDamage(50);
		System.out.println("His health is now at " + robin.getHealth() + " hp");
		
		// Heal
		System.out.println(robin.getName() + " takes a deep breath and recovers 5 hp.");
		robin.heal(5);
		System.out.println("His health is now at " + robin.getHealth() + " hp");
		
		// Take damage
		System.out.println("The shrubery regroups and deals 119 damage to poor " + robin.getName());
		robin.takeDamage(119);
		System.out.println("His health is now at " + robin.getHealth() + " hp");
		
		// Heal
		System.out.println("Brave Sir Robinn calls on the power of all the past Avatars, enters the Avatar state and heals for 128 point");
		robin.heal(128);
		System.out.println("His health is now at " + robin.getHealth() + " hp");
		
		System.out.println("\n----------Final State----------");
		System.out.println("Displaying Nameless Hero: " + unnamed.toString());
		System.out.println("Displaying Named Hero: " + robin.toString());
		
	}

}
