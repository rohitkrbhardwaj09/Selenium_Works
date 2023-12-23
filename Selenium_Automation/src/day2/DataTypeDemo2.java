package day2;

public class DataTypeDemo2 {

	public static void main(String[] args) {
		
		int a = 100, b = 200;
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);

		long lng = 1234567889;
		System.out.println(lng);
	
		byte by = -100;
		System.out.println(by);
		
//		byte by2 = -150; // Invalid
//		System.out.println();
		
		short sh = 32765;
		System.out.println(sh);
		
		//Decimal numbers
		float item_price = 15.50F;
		System.out.println(item_price);
		
		double d = 1234.65645645;
		System.out.println(d);
		
		//Which one is valid
		double du = 125; //Valid
		System.out.println(du);
		
//		int it = 10.5; //Invalid
		
		char grad = 'A';
		System.out.println("The grad of the Student is: "+grad);
		
		boolean boo = false;
		System.out.println(boo);
		
		String person_name = "John Kenedy";
		System.out.println("The name of the person is: "+ person_name);
		
		String str = "A";
		System.out.println(str);
		
//		char ch = 'abc';  Invalid
//		boolean boo1 = "true"; Invalid
		
//		String sr = true; 
		String sr2 = "true"; //Valid
		System.out.println(sr2);
	}

}
