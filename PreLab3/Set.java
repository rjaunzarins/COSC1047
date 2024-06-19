package PreLab3;

public class Set {

	private int[] arr;
	private int numItems;
	
	/**
	 * Constructor
	 * Creates a new array of 10 elements and assigns it to
	 * arr. numItems is initialized to 0.
	 */
	public Set() {
		this.arr = new int[10];
		this.numItems = 0;
	}
	
	/**
	 * add Method - add value to next open element. If array
	 * is full it creates a new array, copies the original
	 * array, and then adds value passed to method
	 * @param value The value to be added to the array
	 */
	public void add(int value) {
		if(numItems < arr.length) {
			arr[numItems] = value;
			numItems++;
		}
		else {
			int[] arr2 = new int[arr.length*2];
			
			for(int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			this.arr = arr2;
			arr[numItems] = value;
			numItems++;
		}
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < numItems; i++) {
			if(i < numItems-1)
				str.append(String.valueOf(arr[i]) + ", ");
			else
				str.append(String.valueOf(arr[i]));
		}
		return str.toString();
	}
	
	/**
	 * getLength Method 
	 * @return The length of arr
	 */
	public int getLength() {
		return arr.length;
	}
	
	public int getNumItems() {
		return numItems;
	}
}
