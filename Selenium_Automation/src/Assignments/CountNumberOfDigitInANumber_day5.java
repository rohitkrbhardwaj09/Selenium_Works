package Assignments;

public class CountNumberOfDigitInANumber_day5 {

	public static void main(String[] args) {
		
		int number = 123456742;
		int count = 0;
		
		while(number != 0) {
			number = number/10;
			++count;
		}
		
		System.out.println(count);

	}

}
