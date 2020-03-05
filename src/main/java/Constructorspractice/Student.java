package Constructorspractice;



public class Student {
	
	String name;
	
	public Student()
	{
		name = "unknown"; //default constructor unknown value is printed here
		
	}
	
	public Student(String fname) { 	// constructor overloading - passing parameter inside		
		name = fname;			
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student();
		System.out.println(stu.name);

		Student  stu1 = new Student("Sathya");
		System.out.println(stu1.name);
	}

}