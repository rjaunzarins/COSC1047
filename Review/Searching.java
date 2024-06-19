package Review;

public class Searching {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(binarySearch(arr, 51));
	}
	
//	public static int sequentialSearch(int[] arr, int value) {
//		
//	}
	
	public static int binarySearch(int[] arr, int value) {
		int first = 0;
		int last = arr.length - 1;
		
		while(first <= last) {
			int mid = (first + last) / 2;
			if(arr[mid] == value) { 
				return mid;
			}
			else if(arr[mid] > value) {
				last = mid - 1;
			}
			else {
				first = mid + 1;
			}
		}
		return -1;
	}
}
