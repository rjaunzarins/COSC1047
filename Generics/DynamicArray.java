package Generics;

public class DynamicArray {

	private int[] data;
	private int numItems;
	
	public DynamicArray(){
		data = new int[10];
		numItems = 0;
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
			this.data = new int[size];
			this.numItems = 0;
		}
	}
	
	/**
	 * Copy Constructor
	 * @param d The DynamicArray object to copy
	 */
	public DynamicArray(DynamicArray d) {
		
		this.data = new int[d.data.length];
		this.numItems = 0;
		for(int i = 0; i < d.numItems; i++) {
			this.data[i] = d.data[i];
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
		if(numItems < data.length) {
			data[numItems] = value;
			numItems++;
		}
		else {
			int[] arr2 = new int[data.length*2];
			
			for(int i = 0; i < data.length; i++) {
				arr2[i] = data[i];
			}
			this.data = arr2;
			data[numItems] = value;
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
		else
			System.out.println("Array is empty");
	}
	
	/**
	 * getLength Method 
	 * @return The number of elements in arr
	 */
	public int getLength() {
		return data.length;
	}
	
	/**
	 * getNumItems Method
	 * @return The number of items in the array
	 */
	public int getNumItems() {
		return numItems;
	}
	
	public int getValue(int element) {
		return data[element];
	}
	
	/**
	 * toString method
	 * @return The String representation of the object
	 */
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < numItems; i++) {
			if(i < numItems-1)
				str.append(String.valueOf(data[i]) + ", ");
			else
				str.append(String.valueOf(data[i]));
		}
		return str.toString();
	}
}
