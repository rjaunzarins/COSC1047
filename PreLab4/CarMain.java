package PreLab4;

public class CarMain {

	public static void main(String[] args) {
		
		System.out.println("Car1:");
		Car car1 = new Car("Toyota", "Tacoma", 4);
		System.out.println(car1.toString());
		
		System.out.println("\nCar2:");
		Car car2 = new Car("Nissan", "Murano", 4);	
		System.out.println(car2.toString());
		
		car1.setMake("Dodge");
		car1.setModel("Charger");
		
		System.out.println("\nCar1:");
		System.out.println(car1.toString());
		
		System.out.println("\nCar 1 equals Car2: " + car1.equals(car2));
		
		car2.setMake("Dodge");
		car2.setModel("Charger");
		
		System.out.println("\nCar2:");
		System.out.println(car2.toString());
		
		System.out.println("\nCar 1 equals Car2: " + car1.equals(car2));
		System.out.println("Done");
	}

}
