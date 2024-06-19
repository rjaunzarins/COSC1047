package Review;

public class Sorting {

	public static void main(String[] args) {
		
		int[] arr = { 3, 6, 8, 2, 7, 1 };
		int[] arr2 = { 3, 8, 9, 6, 4, 7, 3 };
		int[] arr3 = { 2, 6, 5, 8, 3, 5, 4 };
		int[] arr4 = { 2, 6, 5, 8, 3, 5, 29 };
		int[] arr5 = { 2, 6, 5, 8, 3, 5, 0 };
		System.out.println("Bubble Sort: ");
		printArr(arr);
		bubbleSort(arr);
		printArr(arr);
		System.out.println("\nSelection Sort: ");
		printArr(arr2);
		selectionSort(arr2);
		printArr(arr2);
		System.out.println("\nInsertion Sort: ");
		printArr(arr3);
		insertionSort(arr3);
		printArr(arr3);
		System.out.println("\nInsertion Sort: ");
		printArr(arr4);
		insertionSort(arr4);
		printArr(arr4);
		System.out.println("\nInsertion Sort: ");
		printArr(arr5);
		insertionSort(arr5);
		printArr(arr5);
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1)
				System.out.print(arr[i] + "\n");
			else
				System.out.print(arr[i] + " ");
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr) {
		int index;
		for(int i = 0; i < arr.length; i++) {
			index = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && temp <= arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	

}
