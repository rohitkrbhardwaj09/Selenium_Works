package Assignments;

public class Day6_FindEvenAndOddNumbersFromArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6};
		int countEven = 0, countOdd = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i]+" is a Even number.");
				++countEven;
			}else {
				System.out.println(a[i]+" is a Odd number.");
				++countOdd;
			}
		}
		
		System.out.println("Even: "+countEven);
		System.out.println("Odd: "+countOdd);
		
	}

}
