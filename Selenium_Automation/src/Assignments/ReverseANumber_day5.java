package Assignments;

public class ReverseANumber_day5 {

	public static void main(String[] args) {
		
		int number = 1234;
		
		int reversed = 0;
		
		while(number != 0) {
			
			int digit = number % 10;
			reversed = (reversed * 10) + digit;
			number = number / 10;
		}
		
		System.out.println(reversed);

	}

}
