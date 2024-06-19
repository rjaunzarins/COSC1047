package PreLab6;
import java.io.Serializable;

public class DynamicArray implements Serializable {

	private int[] arr;
	private int numItems;
	
	/**
	 * No-Arg Constructor
	 * Creates a new array of 10 elements and assigns it to
	 * arr. numItems is initialized to 0.
	 */
	public DynamicArray() {
		this.arr = new int[10];
		this.numItems = 0;
	}
	
	/**
	 * Constructor
	 * @param size The size of the array
	 * @exception IllegalArgumentException If the argument is less than 0
	 */
	public DynamicArray(int size) throws IllegalArgumentException {
		
		if(size < 0) {
			throw new IllegalArgumentException
				("You cannot have a negatively sized array!");
		}
		else {
			this.arr = new int[size];
			this.numItems = 0;
		}
	}
	
	/**
	 * Copy Constructor
	 * @param d The DynamicArray object to copy
	 */
	public DynamicArray(DynamicArray d) {
		
		this.arr = new int[d.arr.length];
		this.numItems = 0;
		for(int i = 0; i < d.numItems; i++) {
			this.arr[i] = d.arr[i];
			this.numItems++;
		}
		
	}
	
	/**
	 * pushBack Method - add value to next open element. If array
	 * is full it creates a new array, copies the original
	 * array, and then adds value passed to method
	 * @param value The value to be added to the array
	 */
	public void pushBack(int value) {
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
	 * popBack Method - removes the last element in the
	 * array by removing one from numItems.
	 */
	public void popBack() {
		if(numItems > 0) {
			numItems--;
		}
	}
	
	/**
	 * getLength Method 
	 * @return The number of elements in arr
	 */
	public int getLength() {
		return arr.length;
	}
	
	/**
	 * getNumItems Method
	 * @return The number of items in the array
	 */
	public int getNumItems() {
		return numItems;
	}
	
	/**
	 * toString method
	 * @return The String representation of the object
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
}
