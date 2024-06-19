package Review;

public class DynamicArrayGeneric<E> {

	private E[] data;
	private int numItems;
	
	public DynamicArrayGeneric(){
		this(10);
	}
	
	/**
	 * Constructor
	 * @param size The size of the array
	 * @exception IllegalArgumentException If the argument is less than 0
	 */
	public DynamicArrayGeneric(int size) throws IllegalArgumentException {
		
		if(size < 0) {
			throw new IllegalArgumentException
				("You cannot have a negatively sized array!");
		}
		else {
			this.data = (E[]) new Object[size];
			this.numItems = 0;
		}
	}
	
	/**
	 * Copy Constructor
	 * @param d The DynamicArray object to copy
	 */
	public DynamicArrayGeneric(DynamicArrayGeneric d) {
		
		this.data = (E[]) new Object[d.data.length];
		this.numItems = 0;
		for(int i = 0; i < d.numItems; i++) {
			this.data[i] = (E) d.data[i];
			this.numItems++;
		}
		
	}
	
	/**
	 * pushBack Method - add value to next open element. If array
	 * is full it creates a new array, copies the original
	 * array, and then adds value passed to method
	 * @param value The value to be added to the array
	 */
	public void pushBack(E value) {
		if(numItems < data.length) {
			data[numItems] = value;
			numItems++;
		}
		else {
			E[] data2 = (E[]) new Object[data.length*2];
			
			for(int i = 0; i < data.length; i++) {
				data2[i] = data[i];
			}
			this.data = data2;
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
			data[--numItems] = null;
		}
		else
			System.out.println("Array is empty");
	}
	
	public int searchArr(E value) {
		for(int i=0; i < numItems; i++) {
			if(data[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public void sort() {
		for(int i = 0; i < numItems; i++) {
			for(int j = 1; j < numItems; j++) {
				if(((Comparable)data[j-1]).compareTo(data[j]) > 0) {
					E temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
		}
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
	
	public E getValue(int element) {
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
	public static void main(String[] args) {
		DynamicArrayGeneric arr = new DynamicArrayGeneric();
		arr.pushBack(2);
		arr.pushBack(0);
		arr.pushBack(9);
		arr.pushBack(8);
		arr.pushBack(6);
		arr.pushBack(1);
		arr.pushBack(3);
		arr.pushBack(8);
		arr.pushBack(6);
		arr.pushBack(5);
		System.out.println(arr.toString());
		arr.sort();
		System.out.println(arr.toString());
		arr.popBack();
		arr.popBack();
		System.out.println(arr.toString());
	}
}

