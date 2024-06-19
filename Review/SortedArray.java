package Review;

public class SortedArray<E> {
	private E[] arr;
	private int numItems;
	
	@SuppressWarnings("unchecked")
	public SortedArray() {
		arr = (E[]) new Object[10];
		numItems = 0;
	}
	
	@SuppressWarnings("unchecked")
	public SortedArray(int size) {
		arr = (E[]) new Object[size];
		numItems = 0;
	}
	
	public void printArray() {
		if(numItems == 0) {
			System.out.println("Array Empty");
		}
		else {
			for(int i = 0; i < numItems; i++) {
				System.out.printf("%2d ", arr[i]);
			}
			System.out.println();
		}
	}
	
	public int getNumItems() {
		return numItems;
	}
	
	public int getSize() {
		return arr.length;
	}
	
	public void setElement(E value) {
		if(numItems == 0) {
			arr[0] = value;
			numItems++;
			printArray();
			return;
		}
		else if(numItems == arr.length) {
			System.out.println("Array is Full");
		}
		else {
			for(int i = 0; i <= numItems; i++) {
				if(((Comparable)arr[i]).compareTo(value) > 0) {
					for(int j = numItems; j > i; --j) {
						arr[j] = arr[j-1];
					}
					arr[i] = value;
					break;
				}
				else {
					arr[numItems] = value;
				}
			}
			numItems++;
			printArray();
		}
	}
	
	public void removeElement(int idx) {
		if(numItems > 0) {
			// If index is 0 or greater & less than last element
			if(idx >= 0 && idx < numItems-1) {
				for(int i = idx; i < numItems-1; i++) {
					arr[i] = arr[i+1];
				}
				arr[numItems-1] = null;
				--numItems;
				printArray();
			}
			// Else if last element
			else if(idx == numItems-1){
				arr[numItems-1] = null;
				--numItems;
				printArray();
			}
			// Else invalid number
			else
				System.out.println("Index does not exist");
		}
		else
			System.out.println("Array Empty");
	}
	public static void main(String[] args) {
		SortedArray<Integer> sArr = new SortedArray<>();
		sArr.setElement(10);
		sArr.setElement(8);
		sArr.setElement(5);
		sArr.setElement(4);
		sArr.setElement(1);
	}
}

