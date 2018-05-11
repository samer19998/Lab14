package edu.handong.csee.java.lab14.prob02;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputExceptions {
	
	private int x = 0, y = 0;// integer variables
	
	public InputExceptions()// special method
	{}
	public void error_det() {//special method
	try {//try block
		Scanner keyboard = new Scanner(System.in);//to use the Scanner class
		System.out.print("X: ");//print out x
		x = keyboard.nextInt();//to get x from keyboard
		System.out.print("y: ");//print y
		y = keyboard.nextInt();//get the value from the keyboard
		System.out.println(this.x/this.y);//print the line 
		
	}
	catch(ArithmeticException e) {// catch block
		System.out.println("java.land.ArithmeticException: " + e.getMessage());//print out the line
		
	}
	catch(InputMismatchException e) {//catch block
		System.out.println("java.lang.InputMismatchException: "+ e.getMessage());// print out the line
	}
	catch(Exception e) {// catch block
		System.out.println("Some other exception has occurred: " + e.getMessage());// print out the line
	   }
	}
	

}
