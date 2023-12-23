package Assignments;

public class Day7_SwapTwoString {

	public static void main(String[] args) {
		
		String str1 = "One";
		String str2 = "Two";
		
		String temp;
		
		System.out.println("Before Swapping: ");
		System.out.println("String 1: "+ str1);
		System.out.println("String 2: "+ str2);
		
		
		temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("After Swapping: ");
		System.out.println("String 1: "+ str1);
		System.out.println("String 2: "+ str2);

	}

}
