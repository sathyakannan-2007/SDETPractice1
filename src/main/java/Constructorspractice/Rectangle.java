package Constructorspractice;

public class Rectangle {
	int length = 0;
	int breadth = 0;
	int area;
	
	public Rectangle() {
		area = length*breadth;
	}
	public Rectangle (int len, int br) {
		length = len;
		breadth = br;		
		area = length*breadth;
	
	}
	
	public Rectangle (int num) {
		length = num;
		breadth = num;
		area = length*breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R1 = new Rectangle();
		System.out.println(R1.area);
		//System.out.println(R1.length);
		//System.out.println(R1.breadth);
		
		Rectangle R2 = new Rectangle(10,20);
		System.out.println(R2.area);
		
		
		Rectangle R3 = new Rectangle(5);
		System.out.println(R3.area);
		
		

	}

}
