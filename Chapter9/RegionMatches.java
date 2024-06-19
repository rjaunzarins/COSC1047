package Chapter9;

public class RegionMatches {

	public static void main(String[] args) {
		
		String str = "asdvdgEr";
		int strLength = str.length();
		
		if(str.regionMatches(true, strLength - 3, "ger", 0, 3))
			System.out.println(true);
		else
			System.out.println(false);
		

		String str1 = "William ";
		String str2 = " the ";
		String str3 = " Conqueror"; System.out.println(str1.trim() + 
				        str2.trim() + str3.trim());
		
		double number = 9.47;
		String str4;
		str4 = Double.toString(number);
		System.out.println(str4);

	}

}
