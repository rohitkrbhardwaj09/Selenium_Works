package Assignments;

public class LargestOfTwoNumbers_day4 {

	public static void main(String[] args) {
		
		int a = 200;
		int b = 100;
		
		int x = 10; 
		int y = 20;
		
		//Using if...else
		if(a > b) {
			System.out.println("A is greater");
		}else {
			System.out.println("B is greater");
		}

		
		//Using ternary
		String result = (x > y) ? "X is greater" : "Y is greater";
		System.out.println(result);
	
	}

}
