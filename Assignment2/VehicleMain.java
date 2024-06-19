package Assignment2;

public class VehicleMain {

	public static void main(String[] args) {
		
		Car car1 = new Car("Ford", 1995, 5);
		Car car2 = new Car("Dodge", 1986, 3);
		Car car3 = new Car("Ford", 1995, 5);
		
		Motorcycle bike1 = new Motorcycle("Honda", 2010, true);
		Motorcycle bike2 = new Motorcycle("Yamaha", 2010, false);
		Motorcycle bike3 = new Motorcycle("Honda", 2010, true);
		
		System.out.println("---- Cars ----");
		System.out.println(car1);
		System.out.println("\n" + car2);
		System.out.println("\n" + car3);
		System.out.println("\nCar1 & Car2: " + car1.equals(car2));
		System.out.println("Car1 & Car3: " + car1.equals(car3));
		
		System.out.println("\n---- Bikes ----");
		System.out.println(bike1);
		System.out.println("\n" + bike2);
		System.out.println("\n" + bike3);
		System.out.println("\nBike1 & Bike2: " + bike1.equals(bike2));
		System.out.println("Bike1 & Bike3: " + bike1.equals(bike3));
		
		
		Vehicle[] v1 = new Vehicle[5];
		v1[0] = new Car("Ford", 1995, 5);
		v1[1] = new Car("Dodge", 1986, 3);
		v1[2] = new Car("Ford", 1995, 5);
		v1[3] = new Motorcycle("Honda", 2010, true);
		v1[4] = new Motorcycle("Honda", 2010, true);
		
		System.out.println("\n---- Vehicle Array ----");
		System.out.println(v1[0]);
		System.out.println("\n" + v1[1]);
		System.out.println("\n" + v1[2]);
		System.out.println("\n" + v1[3]);
		System.out.println("\n" + v1[4]);
		System.out.println("\nv1[0] & v1[1]: " + v1[0].equals(v1[1]));
		System.out.println("v1[0] & v1[2]:: " + v1[0].equals(v1[2]));
		System.out.println("\nv1[0] & v1[4]: " + v1[0].equals(v1[4]));
		System.out.println("v1[3] & v1[4]:: " + v1[3].equals(v1[4]));
	}

}
