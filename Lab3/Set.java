package Lab3;

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
	 * Copy Constructor
	 * @param s The Set object to copy
	 */
	public Set(Set s) {
		
		this.arr = new int[s.arr.length];
		this.numItems = 0;
		for(int i = 0; i < s.numItems; i++) {
			this.arr[i] = s.arr[i];
			this.numItems++;
		}
		
	}
	
	/**
	 * add Method - add value to next open element. If array
	 * is full it creates a new array, copies the original
	 * array, and then adds value passed to method
	 * @param value The value to be added to the array
	 */
	public boolean add(int value) {
		
		for(int  i = 0; i < this.numItems; i++) {
			if ( arr[i] == value )
				return false;
		}
		if(numItems < arr.length) {
			arr[numItems] = value;
			numItems++;
			return true;
		}
		else {
			int[] arr2 = new int[arr.length*2];
			
			for(int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			this.arr = arr2;
			arr[numItems] = value;
			numItems++;
			return true;
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
	
	/**
	 * getNumItems Method
	 * @return The value in numItems
	 */
	public int getNumItems() {
		return numItems;
	}
}
