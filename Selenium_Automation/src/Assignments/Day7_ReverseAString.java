package Assignments;

public class Day7_ReverseAString {

	public static void main(String[] args) {
		
		String str = "Rohit Bhardwaj";
		
		char a;
		String reversedStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			a = str.charAt(i);
			reversedStr = reversedStr + a;
		}

		System.out.println(reversedStr);
	}

}
