package Generics;

public class ArrayBag<E> {

	private E[] data;
	private int numItems;
	
	public ArrayBag() {
		data = (E[]) new Object();
		numItems = 0;
	}
	public ArrayBag(int size) {
		data  = (E[]) new Object[size];
		numItems = 0;
	}
	
	public void add(E value) {
		if (data.length == numItems) {
			E[] newData = (E[])new Object[2*data.length];
			for(int i = 0; i < numItems; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
		data[numItems++] = value;
	}
	
	public void addMany(E... elements) {
		if(numItems + elements.length > data.length) {
			
		}
	}
	
	public void addAll(ArrayBag<E>...elements) {
		
	}
	
	public ArrayBag<E> clone(){
		ArrayBag<E> answer;
		try {
			answer = (ArrayBag<E>)super.clone();
		}
		catch(CloneNotSupportedException e) {
			throw new RuntimeException("...");
		}
		answer.data = data.clone();
		return answer;
	}
	
	public E grab() {
		if(numItems == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int rand = (int)(Math.random() * numItems);
		
		E value = data[rand];data[rand] = data[--numItems];
		return value;
	}
	
	public String toString() {
		String str = "[";
		if(numItems > 0) {
			for(int i = 0; i < numItems; i++) {
				str += data[i] + ", ";
			}
			str += data[numItems-1];
		}
		return str + "]";
	}
	
	public static void main(String[] args) {
		ArrayBag<String> ab = new ArrayBag<>(10);
		ab.add("Chris");
		ab.add("Tom");
		ab.add("Fred");
		ab.add("George");
		ab.add("Apples");
		ab.add("Oranges");
		ab.add("Bananas");
		System.out.println(ab);
		System.out.println("Removing " + ab.grab());
		System.out.println(ab);
	}
}
