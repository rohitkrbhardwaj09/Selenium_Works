package Assignments;

public class Day7_CheckStringPresenceInArray {

	public static void main(String[] args) {
		
		String str = "My name is Rohit Bhardwaj.I am from Kanpur";
		

		boolean result = str.contains("Rohit");

		if(result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
