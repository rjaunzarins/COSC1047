package Lab4;

public class VehicleMain {

	public static void main(String[] args) {

		Car t1 = new Car("Catepillar", "C110", 2);
		Car t2 = new Car("Catepillar", "C110", 2);
		Car t3 = new Car("Catepillar", "C115", 2);
		Car t4 = new Car("Volvo", "XM123", 3);
		
		System.out.println("----- Transport Objects -----");
		System.out.println("\nTransport 1: \n" + t1);
		System.out.println("\nTransport 2: \n" + t2);
		System.out.println("\nTransport 3: \n" + t3);
		System.out.println("\nTransport 4: \n" + t4);
		
		System.out.println("\n----- Equals() Checks -----");
		System.out.println("\nTransport 1 & 2: ");
		System.out.println(t1.equals(t2));
		System.out.println("\nTransport 2 & 3: ");
		System.out.println(t2.equals(t3));
		System.out.println("\nTransport 3 & 4: ");
		System.out.println(t3.equals(t4));
	}

}
