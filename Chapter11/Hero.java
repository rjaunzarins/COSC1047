package Chapter11;

import java.io.Serializable;

public class Hero implements Serializable{
	
	private String name;
	private int health;
	
	public Hero() {
		name = "Rhy";
		health = 100;
	}
}
