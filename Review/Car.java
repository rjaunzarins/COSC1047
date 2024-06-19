package Review;

public class Car {
	private int year;
	private String make;
	private int speed;
	
	public Car(int year, String make) {
		this.year = year;
		this.make = make;
		speed = 0;
	}
	
	public Car(Car c) {
		year = c.year;
		make = c.make;
		speed = 0;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void accelerate() {
		if(this.speed + 5 > 210)
			this.speed = 210;
		else 
			this.speed += 5;
	}
	
	public void brake() {
		if(this.speed - 5 < 0)
			this.speed = 0;
		else
			this.speed -= 5;
	}
}
