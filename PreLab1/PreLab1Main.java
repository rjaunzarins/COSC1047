package PreLab1;
import java.util.Scanner;

public class PreLab1Main {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		String[] array = PreLab1Class.createArray(keyb);
		PreLab1Class.insertionSort(array);
		
		String str = PreLab1Class.getSearchString(keyb);
		
		int search = PreLab1Class.sequentialSearch(array, str);
		
		if (search != -1) {
			System.out.println("Search term was found in element " + search);
		} else
			System.out.println("Search term was not found");
		
		PreLab1Class.toString(array);
		keyb.close();
	}

}
