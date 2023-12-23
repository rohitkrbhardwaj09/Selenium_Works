package Assignments;

import java.util.Arrays;

public class Day6_SortingElements {

	public static void main(String[] args) {
		
		int a[] = {50, 20, 40, 10, 70};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		

	}

}
