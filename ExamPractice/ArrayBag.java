package ExamPractice;

public class ArrayBag<E> {
	
	private E[] data;
	private int numItems;
	
	public ArrayBag() {
		this(10);
	}
	
	public ArrayBag(int initialCapacity) {
		if(initialCapacity > 0 && initialCapacity < Integer.MAX_VALUE) {
			data = (E[])new Object[initialCapacity];
			numItems = 0;
		}
		else { throw new IllegalArgumentException("Invalid Capacity"); }
	}
	
	public void add(E element) {
		growAsNeeded();
		data[numItems++] = element;
	}
	
	public void addMany(E... elements) {
		if(numItems + elements.length >= getCapacity())
			growAsNeeded(elements.length);
		System.arraycopy(elements, 0, data, numItems, elements.length);
		numItems += elements.length;
	}
	
	public int countOccurrences(E target) {
		int count = 0;
		for(int i = 0; i < numItems; i++) {
			if(data[i].equals(target))
				count++;
		}
		return count;
	}
	
	public int getCapacity() {
		return data.length;
	}
	
	public boolean remove(E target) {
		int pos = findItem(target);
		if(pos < 0) 
			return false;
		else {	
			data[pos] = data[numItems -1];
			data[numItems - 1] = null;
			numItems--;
			return true;
		}
	}
	
	private int findItem(E item) {
		for(int i = 0; i < numItems; i++) {
			if(data[i].equals(item))
				return i;
		}
		return -1;
	}
	
	public int size() {
		return numItems;
	}
	
	public void trimToSize() {
		if(getCapacity() != numItems) {	
			E[] data2 = (E[]) new Object[numItems];
			for(int i = 0; i < numItems; i++) {
				data2[i] = data[i];
			}
			data = data2;
		}
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for(int i = 0; i < numItems; i++) {
			str.append(data[i] + ",");
		}
		str.append("]");
		return str.toString();
	}
	
	private void growAsNeeded() {
		if(getCapacity() == numItems) {
			E[] data2 = (E[]) new Object[numItems*2];
			for(int i = 0; i < numItems; i++) {
				data2[i] = data[i];
			}
			data = data2;
		}
	}
	private void growAsNeeded(int items) {
		if(getCapacity() < numItems + items) {
			E[] data2 = (E[]) new Object[(numItems+items)*2];
			for(int i = 0; i < numItems; i++) {
				data2[i] = data[i];
			}
			data = data2;
		}
	}
}
