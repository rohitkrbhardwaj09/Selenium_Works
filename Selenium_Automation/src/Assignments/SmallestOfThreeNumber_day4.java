package Assignments;

public class SmallestOfThreeNumber_day4 {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 200; 
		int z = 300;
		
		if((x>y) && (x>z)) {
			System.out.println("X is greater");
		}else if((y>z) && (y>x)) {
			System.out.println("Y is greater");
		}else {
			System.out.println("Z is greater");
		}

	}

}
