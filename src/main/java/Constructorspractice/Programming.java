package Constructorspractice;

public class Programming {
	
	public Programming() {
		System.out.println("I love Programming"); // default constructor
	}

	public Programming(String Programming)
	{
		System.out.println("I love "+ Programming); //overload constructor
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programming Prg = new Programming();
		Programming Prg1 = new Programming("Java"); //passing parameter value
	}

}
