package ExamPractice;

public class PackageMain {
	
	public static void main(String[] args) {
		Package[] pack = new Package[5];
		pack[0] = new Box(1,1,1);
		pack[1] = new Tube(1,1);
		pack[2] = new Box(2,2,2);
		pack[3] = new Tube(2,2);
		pack[4] = new Box(3,3,3);
		
		// It is difficult to get the diameter of the tubes because not all objects
		// are tubes. You must use the instanceof key word to ensure the object is 
		// a tube, then create a new object casted as the type before you call the 
		// getDiameter method from the new object.
		double totalDiam = 0;
		double totalVolBox = 0;
		double totalVolTube = 0;
		double totalAreaBox = 0;
		double totalAreaTube = 0;
		
		int countTube = 0;
		int countBox = 0;
		
		for(int i = 0; i < pack.length; i++) {
			if (pack[i] instanceof Tube) {
				// Create a Tube object if pack[i] instanceof Tube
				Tube t = (Tube)pack[i];
				// Add the diameter to the total diameter
				totalDiam += t.getDiameter();
				// Add vol to totalVolTube
				totalVolTube += t.volume();
				// Add area to totalAreaTube
				totalAreaTube += t.area();
				// Iterate count to count number of items
				countTube++;
			}
			
			if(pack[i] instanceof Box) {
				Box b = (Box)pack[i];
				totalVolBox += b.volume();
				totalAreaBox += b.area();
				countBox++;
			}
		}
		// To get average divide total by count
		double avgDiamTube = totalDiam/countTube;
		double avgVolTube = totalVolTube/countTube;
		double avgAreaTube = totalAreaTube/countTube;
		System.out.printf("Avg Tube Diameter: %,.2f\n", avgDiamTube);
		System.out.printf("Avg Tube Volume: %,.2f\n", avgVolTube);
		System.out.printf("Avg Tube Area: %,.2f\n", avgAreaTube);
		
		double avgVolBox = totalVolBox/countBox;
		double avgAreaBox = totalAreaBox/countBox;
		System.out.printf("\nAvg Box Volume: %,.2f\n", avgVolBox);
		System.out.printf("Avg Box Area: %,.2f\n", avgAreaBox);
	}
}
