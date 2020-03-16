package LoopExercise;

import java.io.InputStream;
import java.util.Scanner;

public class Average {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question 1
		int i;
		int number = 0;
		int value = 0;
		float avg;
		
		 System.out.println("Enter any 10 numbers");
		 for(i = 0; i < 10; i++)
		 {
			 Scanner scan = new Scanner(System.in);
			    number = scan.nextInt();
			    
	  		value += number;			 
		 }
			
		avg = value / 10;
		System.out.println("sum of 10 is : "+value+  "The average is " +avg);
		
	}

}
