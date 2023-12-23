package Assignments;

public class PalindromeNumber_day5 {

	public static void main(String[] args) {
		
		int number = 12321;
		

		boolean result = isPalindrome(number);
		if(result)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

	private static boolean isPalindrome(int number) {
		int reversed = 0;
		int temp = number;
		
		while(number != 0) {
			int digit = number % 10;
			reversed = reversed*10 + digit;
			number = number/10;
		}
		
		if(temp == reversed) {
			return true;
		}else {
			return false;
		}
	}

}
