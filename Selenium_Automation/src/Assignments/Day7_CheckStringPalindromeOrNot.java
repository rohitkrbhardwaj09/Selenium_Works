package Assignments;

public class Day7_CheckStringPalindromeOrNot {

	public static void main(String[] args) {
		
		String str = "madam";
		
		char a;
		String reversedStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			a = str.charAt(i);
			reversedStr = reversedStr + a;
		}
//
//		System.out.println(reversedStr);
		
		if(str.equals(reversedStr)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
