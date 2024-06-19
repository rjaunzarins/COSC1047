package Chapter16;

public class AlgoWorkbench1 {

	public static void main(String[] args) {
		String str = "animal";
		displayCharacters(str, 0);
		System.out.println();
		displayCharactersBackwards(str, str.length()-1);
	}
	
	public static void displayCharacters(String str, int n) {
		if(n < str.length()) {
			System.out.println(str.charAt(n));
			displayCharacters(str, n+1);
		}
	}
	
	public static void displayCharactersBackwards(String str, int n) {
		if(n >= 0) {
			System.out.println(str.charAt(n));
			displayCharactersBackwards(str, n-1);
		}	
	}
}
