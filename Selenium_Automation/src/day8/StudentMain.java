package day8;

public class StudentMain {

	public static void main(String[] args) {
		
		//There are three different ways to assign values to the variables
		//1) By using Objects
		//2) By using Methods
		//3) By using Constructor'
		
		//1) By using Objects
		Student std1 = new Student();
		std1.sid = 101;
		std1.sname = "ABCD";
		std1.grade = 'A';
		std1.show();
		
		//2) By using Methods
		Student std2 = new Student();
		std2.setData(102, "EFGH", 'B');
		std2.show();
		
		//3) By using Constructor
		Student std3 = new Student(103, "IJKL", 'C');
		std3.show();
	}

}
